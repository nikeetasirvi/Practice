package com.greatlearning.web.service;

import java.util.HashSet;
import java.util.Set;

import com.greatlearning.web.model.Student;

public class StudentService {
	
	// store the students in a set
	
	private Set<Student> students = new HashSet<>();
	
	public Student saveStudent(Student student) {
		this.students.add(student);
		return student;
	}
	
	public Set<Student> fetchAllStudents(){
		return this.students;
	}
	
	public Student findStudentById(long id) {
		return this.students.stream().filter(student -> student.getId() == id).findAny().get();
	}
	
	public void eleteStudentById(long id) {
		this.students.removeIf(student -> student.getId() == id);
	}
}
