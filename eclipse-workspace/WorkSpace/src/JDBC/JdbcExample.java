package JDBC;

import java.sql.*;

public class JdbcExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// Database credentials
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "Test@1234";
		
		// SQL queries
		String createQuery = "INSERT INTO stlist (name, age) VALUES ('John Doe', 30)";
		String readQuery = "SELECT * FROM stlist";
		String updateQuery = "UPDATE stList SET age = 22 WHERE name = 'John Doe'";
		String deleteQuery = "DELETE FROM stList WHERE age <=22";

		try {
			// Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish a connection
			Connection conn = DriverManager.getConnection(url, username, password);
			// Create a statement
			Statement stmt = conn.createStatement();

			// Create a new employee
//	stmt.executeUpdate(createQuery);
	stmt.executeUpdate(updateQuery);
	stmt.executeUpdate(deleteQuery);
	stmt.executeUpdate(createQuery);
			// Read all employees
			ResultSet rs = stmt.executeQuery(readQuery);
			while (rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getInt("Age"));
			}

			// Update an employee
//			stmt.executeUpdate(updateQuery);

			// Delete an employee
//stmt.executeUpdate(deleteQuery);

			// Close the connection
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
