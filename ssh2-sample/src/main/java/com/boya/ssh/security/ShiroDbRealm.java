package com.boya.ssh.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;

import com.boya.ssh.dao.UserDao;
import com.boya.ssh.entity.User;

/**
 * 自定义实现用户认证及授权
 */
public class ShiroDbRealm extends AuthorizingRealm {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 认证回调函数, 登录时调用.
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		ValidateCodeToken token = (ValidateCodeToken) authcToken;

		String validateCode = (String) SecurityUtils.getSubject().getSession().getAttribute("validateCode");
		if (validateCode != null && !validateCode.equalsIgnoreCase(token.getValidateCode())) {
			throw new AuthenticationException("验证码错误！");
		}

		User user = userDao.findUserByLoginName(token.getUsername());
		if (user != null) {
			return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
		} else {
			return null;
		}
	}

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String name = (String) principals.fromRealm(getName()).iterator().next();
		// User user = userDao.findUserByLoginName(name);
		// if (user != null) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// info.addStringPermission("user");
		// for (Group group : user.getGroupList()) {
		// //基于Permission的权限信息
		// info.addStringPermissions(group.getPermissionList());
		// }
		return info;
		// } else {
		// return null;
		// }
	}

	/**
	 * 更新用户授权信息缓存.
	 */
	public void clearCachedAuthorizationInfo(String principal) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
		clearCachedAuthorizationInfo(principals);
	}

	/**
	 * 清除所有用户授权信息缓存.
	 */
	public void clearAllCachedAuthorizationInfo() {
		Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
		if (cache != null) {
			for (Object key : cache.keys()) {
				cache.remove(key);
			}
		}
	}
}
