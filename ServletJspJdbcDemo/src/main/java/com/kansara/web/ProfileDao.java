package com.kansara.web;

import java.sql.*;

public class ProfileDao {
	final String url = "jdbc:mysql://localhost:3306/aditya";
	final String username = "root";
	final String password = "";
	final String sql = "select * from profile where id=?";

	public boolean check(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,username ,password);
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1 ,id);
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	
	public POJO dataFetcher(int id) {
		final String url = "jdbc:mysql://localhost:3306/aditya";
		final String username = "root";
		final String password = "";
		final String sql = "select * from profile where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,username ,password);
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1 ,id);
			ResultSet rs = pstm.executeQuery();
			
			rs.next();
			
			POJO pojo = new POJO();
			pojo.setId(rs.getString(1));
			pojo.setName(rs.getString(2));
			pojo.setPhone(rs.getString(3));
			pojo.setPin(rs.getString(4));
			return pojo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
