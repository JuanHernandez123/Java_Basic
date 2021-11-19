package Example_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1) Create a connection
2) Create a query/statement
3) Execute statement/query
4) close connection

 * 
 */
public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		
		//Create a connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "database.123");

		//Create a query/statement
		Statement stmt=con.createStatement();
		//String s="insert into student values(101,'Scott')";
		//String s="update student set sname='KIM' where sid=105";
		String s="insert into logmnr_user$ (user#,name,logmnr_uid,logmnr_flags,spare1) values (3,'Miguel',54,64,44)";
		
		//Execute statement/query
		stmt.executeQuery(s);
		
		//close connection
		con.close();
		
		System.out.println("Program is completed");
		
		
		
	}

}
