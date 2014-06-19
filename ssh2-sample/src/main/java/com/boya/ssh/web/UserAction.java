package com.boya.ssh.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.boya.ssh.dao.UserDao;
import com.boya.ssh.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户操作
 * 
 * @author boya
 */
@Controller
@Transactional
public class UserAction extends ActionSupport {
	
	private static Logger logger = LoggerFactory.getLogger(UserAction.class);

	private UserDao userDao;
	private UserDao uu = new UserDao();
	
	private User user;
	private Long id;
	private List<User> users;
	

	public UserAction(){
		System.out.println("userAction init!!");
	}
	
	public String save() throws Exception {
		userDao.save(user);
		return list();
	}
	
	public String create() {
		return "input";
	}
	
	public String edit() {
		user = userDao.get(id);
		return "input";
	}

	public String delete(){
		userDao.delete(id);
		return "reload";
	}
	
	public String list() {
		System.out.println(uu);
		System.out.println(userDao);
		users = userDao.findAll();
		return "success";
	}
	
	
	public String execute() {
		return list();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
