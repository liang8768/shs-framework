package com.boya.ssh.dao;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boya.ssh.dao.support.HibernateDao;
import com.boya.ssh.entity.User;

/**
 * 用户管理DAO类
 * 
 * @author boya
 */
@Service
public class UserDao extends HibernateDao<User>{
	

	/**
	 * 根据用户名用户
	 */
	@Transactional
	public User findUserByLoginName(String name) {
		User user = null;

		String hql = "from User where name='"+name+"'";
		List<User> list = getSession().createQuery(hql).list();
		if (list != null & !list.isEmpty()) {
			user = list.get(0);
		}

		return user;
	}
}
