package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class TestDelete {

	public static void main(String[] args) {
		StudentDao studentdao=new StudentDao();
		System.out.println(studentdao.deleteStudentById(2));

	}

}
