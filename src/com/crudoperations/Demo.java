/**@author ayyadav
 * 
 */
package com.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 * 
 */
public class Demo {

	public static final String URL = "jdbc:mysql://localhost:3306/aysoprasteria";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "LeoMessi@10";

	/**
	 * @param argsMar 2, 2024soprasteriajavacom.crudoperations
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection(URL,"root","LeoMessi@10");
		 try {
	            Connection connection = DriverManager.getConnection(URL,"root", "LeoMessi@10");

	            insertEmployee1(connection,"AYUSH",11,"NOIDA","2024-02-01",22);
	            deleteEmployee1(connection, null, 0, null, null, 0);

	 
	            connection.close();
	        } 
		catch (SQLException e) {
	            e.printStackTrace();
		    }
		 
	}
	private static void deleteEmployee1(Connection connection,String emp_name,int emp_id,String emp_address,String emp_joiningdate,int dept_id) throws SQLException
	{
		String sql="DELETE FROM employee1 where id=?";
		
		
	}

	private static void insertEmployee1(Connection connection,String emp_name,int emp_id,String emp_address,String emp_joiningdate,int dept_id) throws SQLException
		 {
			 String sql="INSERT INTO employee1(emp_name,emp_id,emp_address,emp_joiningdate,dept_id) VALUES(?,?,?,?,?)";
			 PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1,emp_name);	
             statement.setInt(2,emp_id);
             statement.setString(3,emp_address);
             statement.setString(4,emp_joiningdate);
             statement.setInt(5,dept_id);
             statement.executeUpdate();
             System.out.println("Employee inserted successfully");
             
             
			 
		 }
}
