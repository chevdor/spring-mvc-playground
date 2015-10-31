package com.chevtech.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/params")
public class ParamsController {

	@RequestMapping("/hi/{country}/{user}")
	protected ModelAndView helloUser(
			@PathVariable("country") String country,
			@PathVariable("user") String user
			){ 
		
		
		ModelAndView mnv = new ModelAndView("Params");
		mnv.addObject("welcomeMessage", "Hi many paramrs, " + user +", " + country + " is a very nice country");
		
		return mnv;
	}

	@RequestMapping("/hello/{country}/{user}")
	protected ModelAndView helloUserMap(
			@PathVariable Map<String, String> parameters){ 
		
		ModelAndView mnv = new ModelAndView("Params");
		mnv.addObject("welcomeMessage", "Hi map nerd!!! " + parameters.get("user") +", " + parameters.get("country") + " is a very nice country");
			
		return mnv;
	}
}
