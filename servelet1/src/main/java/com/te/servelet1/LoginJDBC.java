package com.te.servelet1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class LoginJDBC {
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;

	public static int addStudent(int id,String name,String mail,String password) {
		int res=0;
		try {
			openConnection();
			query="insert into student values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, mail);
			preparedStatement.setString(4, password);
			res = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}

	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver=new Driver();
		DriverManager.registerDriver(driver);
		connection  = DriverManager.getConnection("jdbc:MySql://localhost:3306/learnjdbc?user=root&&password=root");
	
	}
	
	private static void closeConnection() throws SQLException {
		if (preparedStatement!=null) {
			preparedStatement.close();	
		}
		if (connection!=null) {
			connection.close();
		}
		if (driver!=null) {
			DriverManager.deregisterDriver(driver);
			
		}
	}

}
