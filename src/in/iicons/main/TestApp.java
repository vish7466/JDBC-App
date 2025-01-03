package in.iicons.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import in.iicons.utility.JdbcUtil;

public class TestApp {
	public static void main(String[] args) {
		//Resources used
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			//Getting the connection
			connection = JdbcUtil.getDbConnection();
			if (connection != null)
				statement = connection.createStatement();
			if (statement != null)
				resultSet = statement.executeQuery("select sid, name, age, address from student");
			if (resultSet != null) {
				System.out.println("SID\tNAME\tAGE\tADDRESS");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)+ "\t" + resultSet.getString(4));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//Closing the resources
				try {
					JdbcUtil.closeResources(resultSet, statement, connection);
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
}

