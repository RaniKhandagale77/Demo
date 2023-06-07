package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.Teacher_Service;

public class UpdateTeacher {

	public static void main(String[] args) {
		Teacher_Service teacherService=new Teacher_Service();
		Teacher t=teacherService.updateTeacher(1, "vira", "Computer Science Engg");
		System.out.println(t.getName());
		System.out.println(t.getDept_name());
	}
	}

