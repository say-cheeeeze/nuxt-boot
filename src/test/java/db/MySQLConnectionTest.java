package db;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {
		
		private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		private static final String URL = "jdbc:mysql://localhost:3306/nuxtboot?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
		private static final String USER_ID = "nuxtboot";
		private static final String USER_PASSWORD = "nuxtboot";
		
		@Test
		public void testConnection() throws Exception {
				
				Class.forName( DRIVER );
				
				try {
						Connection connection = DriverManager.getConnection( URL, USER_ID, USER_PASSWORD );
						System.out.println( connection );
				}
				catch( Exception e ) {
						e.printStackTrace();
				}
		}
}


