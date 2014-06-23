package com.framework.shs.business.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.framework.shs.business.entity.User;
import com.framework.shs.business.user.service.UserService;

/**
 * 用户的控制器类
 * 
 * UserController.java	
 * @author Liang
 * 2014年6月23日
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	/**
	 * 用户业务逻辑管理类
	 */
	private UserService userService;
	
	/**
	 * 显示用户列表
	 * 
	 * @return
	 */
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model){
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "business/user/index";
	}

	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
