package com.hfxt.cmp.controller.clazz;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hfxt.cmp.model.Clazz;
import com.hfxt.cmp.service.clazz.ClazzService;

@Controller
@RequestMapping("/clazz")
public class ClazzController {

	@Autowired
	ClazzService clazzService;
	 
	@RequestMapping(value = "/clazzList.html", produces = "text/html;charset=UTF-8")
	public String index(Model model) {
		try {
			List<Clazz> clazzList=clazzService.getClazz();
			model.addAttribute("clazzList",clazzList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "clazz/clazz-list";
	}

}
