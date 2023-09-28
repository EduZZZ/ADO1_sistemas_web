package com.br.ado2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index_controller {

	@RequestMapping("/index1")
	public ModelAndView index1() {
		return new ModelAndView("index1");
	}

	@RequestMapping("/index2")
	public ModelAndView index2() {
		return new ModelAndView("index2");
	}
}