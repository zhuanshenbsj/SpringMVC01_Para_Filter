package com.wcxu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/Hello")
public class HelloController {

	@RequestMapping("/Hello.form")
	public String execute() {
		return "Hello";// 返回视图组件的名字
	}
}
