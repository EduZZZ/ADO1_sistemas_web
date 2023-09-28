package com.br.ado2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index_controller {

	/**
	 * View da HomePage
	 * */
	@RequestMapping("/index1")
	public ModelAndView home() {
		return new ModelAndView("index1");
	}
}