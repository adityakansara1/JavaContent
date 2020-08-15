package com.jdbc;

import java.sql.*;

public class Adu {
	public static void main(String[] args) throws Exception
	{
		StudentDAO dao = new StudentDAO();
//		Student s2 = new Student(7 ,"adit" ,"54454564" ,"adi5456@gmail.com");
//		dao.addStudent(s2);
//		Student s1 = dao.getStudent(7);
//		System.out.println("Name : " + s1.name);
//		System.out.println("Phone : " + s1.phone);
//		System.out.println("Email : " + s1.email);
		dao.deleteStudent(7);
	}
}

class StudentDAO
{
	public Student getStudent(int id) throws Exception
	{
		
		Student s = new Student();
		s.id = id;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya" ,"root" ,"");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student_marks1 where id="+id);
		rs.next();
		s.name = rs.getString(2);
		s.phone = rs.getString(3);
		s.email = rs.getString(4);
		
		st.close();
		con.close();
		return s;
	}
	
	public void addStudent(Student s) throws Exception
	{
		String query = "insert into student_marks1 values(? ,? ,? ,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya" ,"root" ,"");
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, s.id);
		st.setString(2, s.name);
		st.setString(3, s.phone);
		st.setString(4, s.email);
		int count = st.executeUpdate();
		System.out.println(count + " Rows affected");
		st.close();
		con.close();
	}
	
	public void deleteStudent(int id) throws Exception
	{
		String query = "delete from student_marks1 where id="+id;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aditya" ,"root" ,"");
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count + " Rows affected");
		st.close();
		con.close();
	}
}

class Student
{
	int id;
	String name;
	String phone;
	String email;
	Student()
	{
		System.out.println("Fetching....");
	}
	Student(int id ,String name ,String phone ,String email)
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email; 
	}
}

