package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NewOne {

	public static void main(String[] args) {


		String url="jdbc:mysql://localhost:3306/student";
		String userName="root";
		String password="Test@1234";
		
//		String createQuery = "INSERT INTO students (name, age,job) VALUES ('John Doe', 30,'Engineer')";
//		String updateQuery = "UPDATE students SET age = 22 WHERE name = 'John Doe'";
//	//	String addColumn="Alter table students add column job varchar(20)";
//		String insertData = "INSERT INTO students (name, age,job) VALUES ('John Doe', 30,'Engineer')\";;
		//String delete=""; 
		String createQuery = "INSERT INTO students (name, age) VALUES ('John Doe', 30)";
		String updateQuery = "UPDATE students SET age = 22 WHERE name = 'John Doe'";
		// Removed addColumn to avoid "Duplicate column" error
		String insertData = "INSERT INTO students (name, age, job) VALUES ('Alice', 25, 'Engineer')";

		String readQuery = "SELECT * FROM students	";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement stm=con.createStatement();
			stm.executeUpdate(createQuery);
		//	stm.executeUpdate(addColumn);
			stm.executeUpdate(insertData);
			stm.executeUpdate(updateQuery);
			ResultSet result=stm.executeQuery(readQuery);
			while(result.next()) {
				System.out.println(result.getInt("id")+" "+result.getString("name") + " " + result.getInt("Age")+" "+result.getString("job"));
			}
			con.close();
			
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
