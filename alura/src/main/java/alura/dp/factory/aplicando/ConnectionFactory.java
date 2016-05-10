package alura.dp.factory.aplicando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://hostname/databaseName", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
