package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestGetById {

	public static void main(String[] args) {
		StudentDao studentdao=new StudentDao();
		Student s=studentdao.getStudentById(3);
		System.out.println(s.getId());
	    System.out.println(s.getEmail());
     	System.out.println(s.getName());
		

	}

}
