package klu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class ViewController 
{
	@GetMapping("/")
	public ModelAndView register()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("insert");
		return MV;
	}

	@GetMapping("/success")
	public ModelAndView success()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("success");
		return MV;
	}
	@GetMapping("/failed")
	public ModelAndView failed()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("failed");
		return MV;
	}
	
	

}
