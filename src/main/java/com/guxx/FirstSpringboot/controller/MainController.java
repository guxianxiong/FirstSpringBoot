package com.guxx.FirstSpringboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/user")
public class MainController {
	
	/**
	 * String类型返回值，会找模板文件
	 * @return
	 */
	@RequestMapping("/list")
//	@ResponseBody
	public String list(ModelMap map) {	
		map.addAttribute("name", "sgk");
		return "list";
	}
}
