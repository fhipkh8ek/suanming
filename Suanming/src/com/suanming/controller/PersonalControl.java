package com.suanming.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suanming.utils.personal.DayYunshi;

@Controller
@RequestMapping("person")
public class PersonalControl {

	@RequestMapping("perDay.htm")
	public String getDayYunshi(HttpServletRequest request, Model model) {
		String inDate = (String) request.getSession().getAttribute("inDate");
		Integer inHour = (Integer) request.getSession().getAttribute("inHour");
		model.addAttribute("person",
				new DayYunshi().getPersonalYun(inDate, inHour));
		return "personal/info";
	}
}
