package com.aioDemo.aioCheckOutDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BackstageController {
	@RequestMapping(value = "/backstage", method = RequestMethod.GET)
	public String backstage(Model model){
		model.addAttribute("info", "reererrerererer");
		return "backstage";
	}
}
