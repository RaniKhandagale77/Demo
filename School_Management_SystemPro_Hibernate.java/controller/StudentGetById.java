package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.Student_Service;

public class StudentGetById {

	public static void main(String[] args) {
		Student_Service studentService=new Student_Service();
		Student student=studentService.getStudentById(1);
		if(student!=null) {
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getCon_no());
		}
		else {
			System.out.println("Incorrect Id");
		}
	}
}