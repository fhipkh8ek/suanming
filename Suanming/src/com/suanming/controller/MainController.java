package com.suanming.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	/**
	 * 
	* @Title: getPersonInfo
	* @Description: TODO
	* @return
	* @autor:weixin
	* @time:2015年1月29日 下午5:20:31
	 */
	@RequestMapping("pinfo.htm")
	public String getPersonInfo(HttpServletRequest request) {
		String inDate = request.getParameter("inDate");
		String inHour = request.getParameter("inHour");
		
		System.out.println(inDate+":"+inHour);
		
		return "index";
	}
	
	
	@RequestMapping("login.htm")
	public String login() {
		return "login";
	}
	
	
}
