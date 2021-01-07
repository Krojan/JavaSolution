package Spring2018;
import java.net.*;
import java.sql.*;

public class testdbEmployee {

	public static void main(String[] args) {
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/testdb";
		Connection con=null;
		
		
		try {
			//load register
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Class.forName("com.mysql.jdbc.Driver");
			//create connection
			con=DriverManager.getConnection(url, username, password);
			//create statement
			Statement st=con.createStatement();
			//execute statement
			String sql="UPDATE employee SET salary='40000' WHERE post='manager' ";
			int m=st.executeUpdate(sql);
			if(m==1) {
				System.out.println("update success!!");
			}
			//close connection
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		
		}

	}

}
