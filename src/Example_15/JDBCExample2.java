package Example_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1) Create a connection
2) Create a query/statement
3) Execute statement/query
4) close connection

 * 
 */
public class JDBCExample2 {

	public static void main(String[] args) throws SQLException {

		// Create a connection

		// Connection -- take into account the bd version to implement the correct syntax to connect
		// con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","system","database.123");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "database.123");

		// Create a query/statement
		Statement stmt = con.createStatement();
	

		 String s="select user#,name,logmnr_uid,logmnr_flags,spare1 from  logmnr_user$";

		// Execute statement/query
		ResultSet rs = stmt.executeQuery(s);

		System.out.println(rs.getRow());

		while (rs.next()) {
			System.out.println("Entró al while");
			
			  int userID=rs.getInt("user#"); String name=rs.getString("name"); int
			  logmnr_uid=rs.getInt("logmnr_uid"); int
			  logmnr_flags=rs.getInt("logmnr_flags"); int spare1 = rs.getInt("spare1");
			  
			  System.out.println("userID:: " + userID); System.out.println("name:: " +
			  name); System.out.println("logmnr_uid::" + logmnr_uid);
			  System.out.println("logmnr_flags::  " + logmnr_flags);
			  System.out.println("spare1:: " + spare1);

		}

		// close connection
		con.close();
		System.out.println("con.isClosed() " + con.isClosed());

		System.out.println("Program is completed");

	}

}
