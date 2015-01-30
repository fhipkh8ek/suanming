package com.suanming.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoTest {
	
	@RequestMapping("index.htm")
	public String index() {
		return "index";
	}
	
}
