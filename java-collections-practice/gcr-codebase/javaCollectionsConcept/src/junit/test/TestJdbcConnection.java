package junit.test;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJdbcConnection {
	
	Connection con;
	Statement st;
	ResultSet rs;
	@BeforeEach
	public void testConnection() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","1234");
	}
	
	@Test
	public void testResult() throws SQLException {
	    st = con.createStatement();
	    rs = st.executeQuery("select * from users");
	    
	    assertNotNull(rs, "ResultSet should not be null");
	     
	    assertFalse(con.isClosed(), "Connection should be open during test");
	    
	    while(rs.next()) {
	        System.out.println(rs.getString("username") + " : " + rs.getString("password"));
	    }
	}
	@AfterEach
	public void closeConnection() throws SQLException{
		if(con!=null) con.close();
		if(st!=null) st.close();
		if(rs!=null) rs.close();
		
		System.out.println("Connetion close sucessfully");
	}
}
