package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class TestUpdate {

	public static void main(String[] args) {
		StudentDao studentdao=new StudentDao();
		String email="abcd@gmail.com";
		boolean flag=studentdao.updateStudentById(1, email);
		System.out.println(flag);
		

	}

}
