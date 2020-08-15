package com.login;

import java.sql.*;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/aditya";
	String username = "root";
	String password = "";
	String sql = "SELECT * FROM logininfo WHERE username=(?) and password=(?)";
	
	public boolean check(String uname ,String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,username ,password);
			PreparedStatement pstm = con.prepareStatement(sql); 
			pstm.setString(1, uname);
			pstm.setString(2, pass);
			ResultSet rs = pstm.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return false;
		
	}
}
