 package mysqlDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLSELECTCOMMAND {

	public static void main(String[] args) throws SQLException {

	//connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	//Statement Query
		Statement stmt=con.createStatement();
	//Query
		String str="select employee_id,first_name,last_name from employees";
	//execute query and store that data in result set
	ResultSet rs=stmt.executeQuery(str);//it return set of records 
			while(rs.next()) {
				int eid=rs.getInt("employee_id");
				String fname=rs.getString("first_name");
				String lname=rs.getString("last_name");
				System.out.println(eid+ " "+fname+" "+lname);
			}
		con.close();

	}

}
