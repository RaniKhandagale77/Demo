package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestMultipleStudentBatch {

	public static void main(String[] args) {
		Student s=new Student();
		ArrayList<Student>al=new ArrayList<>();
		s.setId(5);
		s.setName("Vira");
		s.setEmail("vira12@gmail.com");
		
		Student s1=new Student();
		s1.setId(6);
		s1.setName("Ravi");
		s1.setEmail("ravi12@gmail.com");
		
		Student s2=new Student();
		s2.setId(7);
		s2.setName("Amruta");
		s.setEmail("amruta12@gmail.com");
		
		Student s3=new Student();
		s3.setId(8);
		s3.setName("Ketki");
		s3.setEmail("ketki12@gmail.com");
		
		Student s4=new Student();
		s4.setId(9);
		s4.setName("Madhuri");
		s4.setEmail("madhuri12@gmail.com");
		al.add(s4);
		al.add(s3);
		al.add(s2);
		al.add(s1);
		al.add(s);
		
		StudentDao studentdao=new StudentDao();
		studentdao.addMultipleStudents(al);
		

	}

}
