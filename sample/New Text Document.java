package database
public class Main{
	public static void main(String[] args)
	{
		//Todo auto generated method stub
	}
	
	public static Connection getConnection() throws Exception
	{
		try
		{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/database";
			String username = "username";
			String password = "password";
			Class.forName(driver); Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
}