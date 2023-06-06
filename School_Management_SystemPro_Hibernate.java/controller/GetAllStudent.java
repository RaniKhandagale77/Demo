package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.Student_Service;

public class GetAllStudent {

	public static void main(String[] args) {

		Student_Service studentService=new Student_Service();
		List<Student> students=studentService.getAllStudent();
		for(Student s:students) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getCon_no());
			System.out.println("=================");
			
		}
	}
	}

