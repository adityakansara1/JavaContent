//package com.jdbc;
//
//import java.sql.*;
//
//public class Adi {
//	public static void main(String[] args) throws Exception 
//	{
		
//Example 1	==>Fetch values
//		String url = "jdbc:mysql://localhost:3306/aditya";
//		String username = "root";
//		String password = "";
//		String query = "select * from student_marks1";
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, username, password);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		
//		rs.next();
//		name = rs.getString("name");
//		
//		st.close();
//		con.close();
		
//Example 2 ==> Inser values
//		String url = "jdbc:mysql://localhost:3306/aditya";
//		String username = "root";
//		String password = "";
//		String query = "insert into student_marks1 values(4 ,'"+ username + "' ,'8540008233' ,'knsara@gmail.com')";
//		// String query = "insert into student_marks1 values(? ,? ,? ,?)";
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, username, password);
//		
//		PreparedStatement st = con.prepareStatement(query);
//		st.setInt(1 ,5);
//		st.setString(2, "Adu");
//		st.setString(3, "231231231");
//		st.setString(4, "ac@gmail.com");
//		
//		// THREE STATEMENTS WHEN PREPARED STATEMENT IS NOT THERE...
//		// Statement st = con.createStatement();
//		// ResultSet rs = st.executeQuery(query);
//		// int count = st.executeUpdate(query);
//		
//		
//		int count = st.executeUpdate();
//		System.out.println(count + " Rows affected");
//		
		// THESE STATEMENTS WHEN PREPARED STATEMENT IS NOT THERE...
		// String name = "";
		// while(rs.next()) 
		// {
		// 	 name = rs.getString("name");
		// 	 System.out.println(name);
		// }
		
		
//		st.close();
//		con.close();
//	}
//}


	//Information about "Class.forName("com.mysql.jdbc.Driver");"
	// This Class.forName(""); will instantiate only static block in class any class
	// The other instaces will not be instantiate by this method...
		
	// Example
//	class C1 
//	{
//		static 
//		{
//			System.out.println("hello");
//		} 
//		{
//			System.out.println("hii");
//		}
//		
//	}
//	class ForC1 {
		//public static void main(String[] args)
		//{
		//	Class.forName("C1"); This will Print "hello"
		//  Class.forName("C1"); This will print "Hello" & "hii" both
		//}
		// When you write
		
//	}
