package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Student;
import com.jsp.helper.HelperClass;

public class StudentDao {
	HelperClass helperclass=new HelperClass();
	//to save a student
	Connection connection=null;
	
	public void addMultipleStudents(List<Student> students) {
		connection=helperclass.getConnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		
		try {
			//Create Statement
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
		    //Execute Statement
			
			for(Student s:students) {
				preparedstatement.setInt(1,s.getId());
				preparedstatement.setString(2,s.getName());
				preparedstatement.setString(3,s.getEmail());
				preparedstatement.addBatch();
			}
			
			preparedstatement.executeBatch();
		
		System.out.println("All Good");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	//Get By Id
	public Student getStudentById(int id) {
		connection=helperclass.getConnection();
		String sql="SELECT * FROM student WHERE id=?";
		Student student2=new Student();
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			
			//execute the statement
			ResultSet resultset=preparedstatement.executeQuery();
			while(resultset.next()) {
				int id2=resultset.getInt(1);
				String name=resultset.getString(2);
				String email=resultset.getString(3);
				student2.setId(id2);
				student2.setName(name);
				student2.setEmail(email);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		}
		return student2;
		
	}
	
	
	
	public boolean updateStudentById(int id,String email) {
		connection=helperclass.getConnection();
		
		//create Statement
		String sql="UPDATE student set email=? Where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setInt(2, id);
			
			//execute the statement
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
				
		return true;
		
	}
	
	
	
	
	//GetAll
	public List<Student> getAllStudents(){
		connection=helperclass.getConnection();
		String sql="SELECT * FROM student";
	ArrayList<Student> al=null;
		try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//execute the query
		ResultSet resultset=preparedStatement.executeQuery();
		al =new ArrayList<>();
		while(resultset.next()) {
			int id=resultset.getInt(1);
			String name=resultset.getString(2);
			String email=resultset.getString(3);
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setEmail(email);
			al.add(s);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	   finally {
		   try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
		return al;
		
		
		}
		
	
	//Delete
		public boolean deleteStudentById(int id) {
			connection=helperclass.getConnection();
			String sql="DELETE From student WHERE id=?";
			boolean res=false;
			try {
				//Create Statement
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
			
				
				//execute
				int res2=preparedStatement.executeUpdate();
				if(res2>0) {
					res=true;
				}else {
					res=false;
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return res;
		}		
	
     
	//to save a student
	public Student saveStudent(Student student) {
	Connection connection=helperclass.getConnection();	
	String sql="INSERT INTO student VALUES(?,?,?)"; //?->delimiters/place holder
	
	//create statement
	try {
		PreparedStatement preparedstatement=connection.prepareStatement(sql);
		preparedstatement.setInt(1, student.getId());
		preparedstatement.setString(2,student.getName());
		preparedstatement.setString(3,student.getEmail());
		
		
		//execute the statement
		preparedstatement.execute();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return student;
	}
	
	
	}
