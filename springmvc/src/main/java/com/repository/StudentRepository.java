package com.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dto.Student;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(Student student) {
		System.out.println(student);
		hibernateTemplate.save(student);
	}

	public List<Student> getAll() {
		return hibernateTemplate.loadAll(Student.class);
	}

}
