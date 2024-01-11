package com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Studentlogin;

@Controller
public class StudentController {
	private static Logger log = LoggerFactory.getLogger(StudentController.class.getSimpleName());

	@RequestMapping(path = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","stud",new Studentlogin());

	}
	@RequestMapping(path = "/student", method = RequestMethod.POST)
	public ModelAndView createStandard(@ModelAttribute Studentlogin student) {
		return new ModelAndView("student","stud",student);
		
	}

}
