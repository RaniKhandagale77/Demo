package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Teacher;
import com.jsp.service.Teacher_Service;

public class GetAllTeacher {

	public static void main(String[] args) {

		Teacher_Service teacherService=new Teacher_Service();
		List<Teacher> teacher=teacherService.getAllTeachers();
		for(Teacher t:teacher) {
			System.out.println(t.getId());
			System.out.println(t.getName());
			System.out.println(t.getDept_name());
			System.out.println("=================");
			
		}
	}
}