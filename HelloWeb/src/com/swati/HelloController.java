package com.swati;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	   @RequestMapping("/") 
	     /* public String hello()
	      {
	    	  return "hello";
	      }*/
	   
	   public ModelAndView hello()
	   {
		  ModelAndView model=new ModelAndView("hello");
		  model.addObject("msg","Welcome");
		  return model;
	   }
}

