package com.aaa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("hello")
	public Map<String, String> helloWorld(){
		Map<String,String> map = new HashMap<String,String>();
		String hello = "Hello Kitty";
		map.put("hello", hello);
		return map;
	} 
}
