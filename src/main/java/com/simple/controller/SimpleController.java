package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.service.SimpleService;

@RestController
public class SimpleController {

	@Autowired
	private SimpleService simpleService;

	@RequestMapping("/getMessage")
	public String getDetails() {
		return simpleService.getMsg();
	}
}
