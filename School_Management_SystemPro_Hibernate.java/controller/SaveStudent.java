package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.Student_Service;

public class SaveStudent {

	public static void main(String[] args) {
Student_Service studentService=new Student_Service();
		
		Student student=new Student();
		student.setName("vira");
		student.setEmail("vira@gmail.com");
		student.setCon_no(1247144546);
		
		Student s=studentService.saveStudent(student);
		if(s!=null) {
			System.out.println("Student save");
		}
	}

}
