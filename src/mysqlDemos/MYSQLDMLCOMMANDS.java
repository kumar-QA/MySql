 package mysqlDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDMLCOMMANDS {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		Statement stmt=con.createStatement();
//		String str="insert into student values(2,'b')";
		String str1="update student set sname='prasanna' where sno=3";
		stmt.execute(str1);
		con.close();
		System.out.println("Query executed");
		
		

	}

}
