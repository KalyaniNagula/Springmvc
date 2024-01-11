package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.service.StudentService;

import com.pojo.Studentpojo;

@Controller
public class StudentController2 {
	private static Logger log = LoggerFactory.getLogger(StudentController2.class.getSimpleName());
	@Autowired
	private StudentService StudentService;

	@RequestMapping(path = "/student2", method = RequestMethod.GET)
	public ModelAndView student() {
		System.out.println("get");
		return new ModelAndView("student2", "studentpojo", new Studentpojo());

	}

	@RequestMapping(path = "/studentform", method = RequestMethod.POST)
	public ModelAndView createStandard(@ModelAttribute Studentpojo studentpojo) {
		System.out.println(studentpojo);
		StudentService.save(studentpojo);
		return new ModelAndView("demo","studentpojo",studentpojo);

	}

}
