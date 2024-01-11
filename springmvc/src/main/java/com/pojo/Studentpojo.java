package com.pojo;

public class Studentpojo {
	private long id;
	private String name;
	private String Subject;
	private String faculty;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "Studentpojo [id=" + id + ", name=" + name + ", Subject=" + Subject + ", faculty=" + faculty + "]";
	}
	
}
