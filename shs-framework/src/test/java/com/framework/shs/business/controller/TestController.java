package com.framework.shs.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test/{id}")
	public String test(@PathVariable String id){
		System.out.println("这是一个测试！ID为"+id);
		return "login";
	}
}
