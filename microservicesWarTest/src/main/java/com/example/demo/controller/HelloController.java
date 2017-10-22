package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hi/{name}")
	public  String hiThere(Map model, @PathVariable String name) {
		model.put("name", name);
		return "hello";
	}
}
