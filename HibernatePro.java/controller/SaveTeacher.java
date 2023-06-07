package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.Teacher_Service;

public class SaveTeacher {

	public static void main(String[] args) {

		Teacher_Service teacherService=new Teacher_Service();
		
		Teacher teacher=new Teacher();
		teacher.setName("rani");
		teacher.setDept_name("ComputerScience");
        
		Teacher t=teacherService.saveTeacher(teacher);
		if(t!=null) {
			System.out.println("Teacher Details Save");
		}
	}

}

	