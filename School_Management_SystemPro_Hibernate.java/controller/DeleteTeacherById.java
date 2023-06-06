package com.jsp.controller;

import com.jsp.service.Teacher_Service;

public class DeleteTeacherById {

	public static void main(String[] args) {
		Teacher_Service teacherService=new Teacher_Service();
		boolean flag=teacherService.deleteTeacherById(1);
		if(flag=true) {
			System.out.println("Teacher Details deleted ");
		}
		else {
			System.out.println("Teacher details not deleted");
		}
	}
}
