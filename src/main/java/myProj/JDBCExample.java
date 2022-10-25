package myProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=DriverManager.getConnection("");
		Statement st=con.createStatement();
		String s="insert into student values(106,'Jam')";
		st.execute(s);
		con.close();
		
		ResultSet rs = st.executeQuery(s);
		while(rs.next())
		{
		 int eid=rs.getInt("EMPLOYEE_ID");
		 String fname=rs.getString("First_Name");
		 String lname=rs.getString("Last_Name");
		}
	}

}
