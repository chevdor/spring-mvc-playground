package com.chevtech.hellocontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.jsp.tagext.FunctionInfo;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class HtmlFormController {
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[]{"mobile"});
		SimpleDateFormat funnyFormat= new SimpleDateFormat("yyyy***MM***dd");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(funnyFormat,false));
	}

	@RequestMapping(value="/subscribe", method = RequestMethod.GET)
	protected ModelAndView subscribe(){ 
		ModelAndView modelanview = new ModelAndView("Admission");
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
	@ModelAttribute
	public void addMessage(Model m){
		m.addAttribute("message", "We play with SpringMVC");
	}

	@RequestMapping(value="/confirm2", method = RequestMethod.POST)
	protected ModelAndView confirm2(
			@ModelAttribute("student") Student student, BindingResult result
			){ 

		if (result.hasErrors()){
			// we go back to the initial page
			ModelAndView modelanview = new ModelAndView("Admission");
			return modelanview;	
		}

		ModelAndView modelanview = new ModelAndView("Confirmation2");
		return modelanview;
	}
}
