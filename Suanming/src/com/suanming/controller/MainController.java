package com.suanming.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suanming.dao.idea.IIdeaDao;
import com.suanming.pojo.Idea;
import com.suanming.service.IIdeaService;
import com.suanming.utils.base.BaseUtils;
import com.suanming.utils.personal.DayYunshi;
import com.suanming.utils.personal.pojo.PersonalYun;

@Controller
public class MainController {
	
	@Autowired
	private IIdeaService ideaService;
	
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
	
	
	@RequestMapping("/idea/yijian.htm")
	public String idea(HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr();
		String modelName = request.getParameter("modelName");
		String content = request.getParameter("content");
		Idea idea = new Idea();
		idea.setModelName(modelName);
		idea.setContent(content);
		idea.setIpAddress(ipAddress);
		idea.setCreateTime(BaseUtils.getNowTime(1));
		ideaService.saveIdea(idea);
		return "info";
	}
	
	@RequestMapping("idea/index.htm")
	public String yijianIndex() {
		return "yijian";
	}
}
