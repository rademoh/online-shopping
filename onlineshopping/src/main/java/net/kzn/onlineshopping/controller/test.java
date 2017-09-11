package net.kzn.onlineshopping.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class test {
	/*@RequestMapping(value = {"/test"})
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
		if(greeting == null) {
			greeting = "Hello There";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings",greeting);
		return mv;
	}*/
	

	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		if(greeting == null) {
			greeting = "Hello There";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings",greeting);
		return mv;
	}
}
