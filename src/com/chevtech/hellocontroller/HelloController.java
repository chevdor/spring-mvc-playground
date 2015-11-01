package com.chevtech.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demos")
public class HelloController {

	@RequestMapping("/welcome")
	protected ModelAndView helloWorld(){ 

		ModelAndView modelanview = new ModelAndView("HelloPage");
		modelanview.addObject("welcomeMessage", "HELLO there, I am an object!");
		modelanview.addObject("Stuff", new Stuff(12,"I am a message"));

		return modelanview;
	}


	@RequestMapping("/hi")
	protected ModelAndView thisNameDoesNotMatter(){ 

		ModelAndView modelanview = new ModelAndView("HelloPage");
		modelanview.addObject("welcomeMessage", "HI there!");
		modelanview.addObject("Stuff", new Stuff(-56,"I am a HI Message"));

		return modelanview;
	}

	// this one takes all the others
	@RequestMapping("/*")
	protected ModelAndView test(){ 

		ModelAndView modelanview = new ModelAndView("HelloPageForTheRest");
		modelanview.addObject("welcomeMessage", "HI there!");

		return modelanview;
	}
}
