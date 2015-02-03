package com.suanming.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suanming.utils.wenshi.Suan;
import com.suanming.utils.wenshi.pojo.Matter;

@Controller
@RequestMapping("wenshi")
public class WenshiControl {

	@RequestMapping("result.htm")
	public String getResult(HttpServletRequest request, Model model)
			throws ParseException {
		String type = request.getParameter("type");
		Matter matter = new Suan().getMatterResult(type);
		model.addAttribute("matter", matter);
		return "wenshi/info";
	}

	@RequestMapping("index.htm")
	public String index() {
		return "wenshi/index";
	}
}
