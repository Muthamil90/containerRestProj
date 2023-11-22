package com.simple.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	public String getMsg() {
		return "Hi From Service Class";
	}
}
