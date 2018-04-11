package com.zhaole.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/say")
	@ResponseBody
	public String say(){
		return "你好，王朝辉";
	}
	
	@RequestMapping("/welcomePage")
	public String welcome(){
		return "index";
	}
}
