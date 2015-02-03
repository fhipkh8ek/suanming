package com.suanming.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suanming.utils.personal.DayYunshi;
import com.suanming.utils.personal.pojo.PersonalYun;

@Controller
public class MainController {
	
	/**
	 * 
	* @Title: getPersonInfo
	* @Description: TODO
	* @autor:weixin
	* @time:2015年1月29日 下午5:20:31
	 */
	@RequestMapping("index.htm")
	public String getPersonInfo(HttpServletRequest request) {
		String inDate = request.getParameter("inDate");
		String inHour = request.getParameter("inHour");
		if (StringUtils.isNotBlank(inDate) && StringUtils.isNotBlank(inHour)) {
			request.getSession().setAttribute("inDate", inDate);
			request.getSession().setAttribute("inHour", Integer.parseInt(inHour));
		}
		return "index";
	}
	
	
	@RequestMapping("login.htm")
	public String login() {
		return "login";
	}
}
