package com.boya.ssh.security;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

public class ValidateAuthenticationFilter extends FormAuthenticationFilter {

	protected String getValidateCode(ServletRequest request) {
		return WebUtils.getCleanParam(request, "validateCode");
	}

	protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
		String username = getUsername(request);
		String password = getPassword(request);
		String validateCode = getValidateCode(request);
		boolean rememberMe = isRememberMe(request);
		String host = getHost(request);

		return new ValidateCodeToken(username, password, rememberMe, host, validateCode);
	}

}