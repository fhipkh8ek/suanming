package com.suanming.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.suanming.utils.newBazi.PaiPanClass;
import com.suanming.utils.qiancheng.Result;

@Controller
@RequestMapping("qiancheng")
public class qianchengController {

	@RequestMapping("qiancheng.htm")
	public String getDayYunshi(HttpServletRequest request, Model model) {
		String inDate = (String) request.getSession().getAttribute("inDate");
		Integer inHour = (Integer) request.getSession().getAttribute("inHour");
		String baZiInfo;
		PaiPanClass paiPanClass = new PaiPanClass();
		baZiInfo = paiPanClass.getBaZiInfo(inDate + " " + inHour);
		Result result = new Result();
		String sum = result.duanYu(baZiInfo);
		String comments = sum.split("#")[0];
		String template = sum.split("#")[0];
		String detail = sum.split("#")[2];
		model.addAttribute("comments", comments);
		model.addAttribute("template", template);
		model.addAttribute("detail", detail);

		return "qiancheng/qianchengresult";
	}
}
