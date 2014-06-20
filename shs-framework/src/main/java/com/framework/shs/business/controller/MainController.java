package com.framework.shs.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公用的Controller
 * 
 * MainController.java	
 * @author Liang
 * 2014年6月20日
 */
@Controller
public class MainController {
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
