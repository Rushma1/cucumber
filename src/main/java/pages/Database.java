package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class Database {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDb(String columnName) {

		try {
			// setting properties for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

//		   jdbc:mysql://hostName:portNumber/databaseName
			
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/december_2023";
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			
//			String sqlUrl = "jdbc:mysql://localhost:3306/DBtest";
//			String sqlUsername = "root";
//			String sqlPassword = "Root1234";
			
			String sqlQuery = "SELECT * from login_data;";

			// establish connection to DB
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

			// empowering the connection reference variable to execute queries
			 statement = connection.createStatement();

			// execute query
			resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {
				columnValue = resultSet.getString(columnName);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		return columnValue;
	}
}
  
