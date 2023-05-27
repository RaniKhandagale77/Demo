package com.jsp.controller;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;


public class TestGetAll {

	public static void main(String[] args) {
		StudentDao studentdao=new StudentDao();
		List<Student>al=studentdao.getAllStudents();
		
		for(Student s:al) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println("************************************");
		}
		
	
		
		
			
		}
		

	}

