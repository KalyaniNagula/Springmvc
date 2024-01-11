package com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Student;
import com.pojo.Studentpojo;
import com.repository.StudentRepository;
@Service
public class StudentImp implements StudentService {

	private static Logger log = LoggerFactory.getLogger(StudentImp.class);

	@Autowired
	 private StudentRepository studentRepository;

	@Override
	public void save(Studentpojo studentpojo) {
		Student student=new Student();
//		student.setId(studentpojo.getId());
		student.setName(studentpojo.getName());
		student.setSubject(studentpojo.getSubject());
		student.setFaculty(studentpojo.getFaculty());
		studentRepository.save(student);
		log.info("StudentSe saved-", studentpojo);
	}




}
