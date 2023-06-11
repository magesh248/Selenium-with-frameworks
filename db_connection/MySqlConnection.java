package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection =DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");


		Statement statement= connection.createStatement();

		//   To insert the data to sql
		//	  String sql = "INSERT INTO emp_table VALUES (5, 324, 'Magesh', 'mageshwar248')";
		//	statement.executeUpdate(sql);
		
//		to update
//		String sql= "UPDATE emp_table SET user_name = 'Pranav', password= 'pranav@76' WHERE S_no = 4";
//		
//		statement.executeUpdate(sql);

		ResultSet result= statement.executeQuery("select * from emp_table");

		while (result.next()) {

			System.out.println("s_no:"+ result.getString(1));

			System.out.println("emp_id:"+result.getString(2));
			System.out.println("user_name:"+result.getString(3));
			System.out.println("password:"+result.getString(4));
		}


	}

}
