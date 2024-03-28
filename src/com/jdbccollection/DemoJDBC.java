package com.jdbccollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class DemoJDBC {
	
	public static final String URL="jdbc:mysql://localhost:3306/aysoprasteria";
	
	public static final String USER_NAME="root";
	
	public static String querry="select * from product where product_id=?";
	
	public static void main(String[] args) throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL,"root","LeoMessi@10");
		//Statement stm=con.createStatement();
		PreparedStatement stm=con.prepareStatement(querry);
		stm.setInt(1,5);
		
		ResultSet res=stm.executeQuery();
		while(res.next())
		{
			int num=res.getInt(1);
			String name=res.getString(2);
			Date db=res.getTimestamp(3);
			System.out.println(num);
			System.out.println(name);
			System.out.println(db);
		}
		res.close();
		}

}
