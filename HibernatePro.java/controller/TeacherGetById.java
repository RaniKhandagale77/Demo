package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.Teacher_Service;

public class TeacherGetById {

	public static void main(String[] args) {
		Teacher_Service teacherService=new Teacher_Service();
		Teacher teacher=teacherService.getTeacherById(2);
		if(teacher!=null) {
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getDept_name());
		}
		else {
			System.out.println("Incorrect Id");
		}
	}

}

