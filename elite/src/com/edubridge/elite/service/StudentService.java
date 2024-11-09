package com.edubridge.elite.service;

import com.edubridge.elite.model.Student;

public class StudentService {
	Student[] students;
	
	public StudentService() {
		students = new Student[] {
				new Student(1001,"Sandeep",9988556644L),
				new Student(1002, "Smith", 8988556643L),
				new Student(1003, "Jones", 7988556654L),
				new Student(1004, "Alice", 9988556674L),
				
		};				
		
				
	}
	
	public Student[] getAllStudents() {
		return students;
		
	}
	
	
	

}
