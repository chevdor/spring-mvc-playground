package com.chevtech.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class HtmlFormController {
	
	@RequestMapping(value="/subscribe", method = RequestMethod.GET)
	protected ModelAndView subscribe(){ 
		ModelAndView modelanview = new ModelAndView("Admission");
		modelanview.addObject("message");
		return modelanview;
	}
	
	@RequestMapping(value="/confirm", method = RequestMethod.POST)
	protected ModelAndView confirm(
			@RequestParam(value="name", defaultValue="n/a") String name,
			@RequestParam("hobby") String hobby
			){ 
		ModelAndView modelanview = new ModelAndView("Confirmation");
		modelanview.addObject("msg", "Details: " + name + " " + hobby);
		
		return modelanview;
	}
	
	@RequestMapping(value="/confirm2", method = RequestMethod.POST)
	protected ModelAndView confirm2(
			@ModelAttribute("student") Student student
			){ 
		ModelAndView modelanview = new ModelAndView("Confirmation2");
		modelanview.addObject("message", "very cool, you are now subscribed!");
		
		return modelanview;
	}
}
