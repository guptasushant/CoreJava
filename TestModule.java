 package collection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
public class TestModule extends Module
{
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true) 
		{
			System.out.println(" ");
			System.out.println(" ");
			Module module = new TestModule();
			System.out.println("--------Enter the details below--------");
			System.out.println("enter the id of user ");
			module.setId( sc.nextInt());
			sc.nextLine();
			System.out.println("enter the name of user ");
			module.setName(sc.nextLine());
			System.out.println("----the data is given below----");
			System.out.println(module.toString());
			System.out.println("enter more user ");
			String url="jdbc:mysql://localhost:3306/sushant";
			String username="root";
			String password="root";
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection(url,username,password);
				//System.out.println(connection);
				PreparedStatement statement = connection.prepareStatement("select * from userinput where id = ?");
				statement.setInt(1, module.getId());
				ResultSet executeQuery = statement.executeQuery();
			
				if (executeQuery.next()) 
				{
				System.out.println("id already exist use another ID :"+module.getId());
				}
				else 
				{
				String insertDataSQL = "INSERT INTO userinput (id, name) VALUES (?, ?)";
			    PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL);
		        preparedStatement.setInt(1, module.getId());
		        preparedStatement.setString(2, module.getName());
		        preparedStatement.executeUpdate();
				}
			
			} 
			catch ( ClassNotFoundException | SQLException e) 
			{
			e.printStackTrace();
			}
	    
		}
	}
}
