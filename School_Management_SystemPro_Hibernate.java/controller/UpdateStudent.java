package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.Student_Service;

public class UpdateStudent {

	public static void main(String[] args) {
		Student_Service studentService=new Student_Service();
		Student s=studentService.updateStudent(1, "vira", "vira@gmail.com",1234567891);
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.getCon_no());
		
	}

}

	