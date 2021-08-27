package Databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {
	
	@Test
	public void TestDB() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3307/student", "root","vagi$3encumb"); //import from java.sql
		
		System.out.println("Connected to MySQL DB");
		
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select*from new_joinee");
		
		while(rs.next())
		{
			
		String cand_name = 	rs.getString("cand_name");
		
		System.out.println("Database record is: " + cand_name);
			
			
		}
		
		
		
		
	}

}
