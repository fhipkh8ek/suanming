package com.suanming.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.suanming.utils.newBazi.PaiPanClass;
import com.suanming.utils.wenren.Result;

@Controller
@RequestMapping("wenren")
public class WenrenController {

	@RequestMapping("suan.htm")
	public String suan(HttpServletRequest request,Model model) {
		Integer inHour1 = (Integer) request.getSession().getAttribute("inHour");
		String inDate1 = (String) request.getSession().getAttribute("inDate");
		
		String inDate2 = request.getParameter("inDate2");
		String inHour2String = request.getParameter("inHour2");
		String type = request.getParameter("type");
		
		if (StringUtils.isBlank(inHour2String)) {
			inHour2String = "1";
		}
		Integer inHour2 = Integer.parseInt(inHour2String);
		
		PaiPanClass baziInfo = new PaiPanClass();
		
		//八字
		String firbz = baziInfo.getBaZiInfo(inDate1+" "+inHour1);
		
		String secbz = baziInfo.getBaZiInfo(inDate2+" "+inHour2);
		
		Result result = new Result();
		String duanyu = result.getDuanyu(firbz, secbz,type);
		
		System.out.println("第一个人八字："+firbz);
		System.out.println("第二个人八字："+secbz);
		
		model.addAttribute("xingge", duanyu.split("@")[0]);
		model.addAttribute("zongjia", duanyu.split("@")[1]);
		
		
		return "wenren/info";
	}
	
	@RequestMapping("index.htm")
	public String index() {
		return "wenren/index";
	}
}
