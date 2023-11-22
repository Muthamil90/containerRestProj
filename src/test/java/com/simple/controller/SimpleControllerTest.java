package com.simple.controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.simple.service.SimpleService;

@SpringBootTest
public class SimpleControllerTest {

	@Mock
	private SimpleService simpleService;

	@InjectMocks
	private SimpleController simpleController;

	@Test
	void testMessage() {
		when(simpleService.getMsg()).thenReturn("Hi From Shiva");
		assertSame("Hi From Shiva",simpleController.getDetails());
	}

}
