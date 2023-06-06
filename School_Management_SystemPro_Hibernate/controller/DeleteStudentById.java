package com.jsp.controller;

import com.jsp.service.Student_Service;

public class DeleteStudentById {

	public static void main(String[] args) {
		Student_Service studentService=new Student_Service();
		boolean flag=studentService.deleteStudentById(1);
		if(flag=true) {
			System.out.println("Student Details deleted ");
		}
		else {
			System.out.println("Student details not deleted");
		}

	}

}
