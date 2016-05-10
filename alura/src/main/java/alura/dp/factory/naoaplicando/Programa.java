package alura.dp.factory.naoaplicando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://hostname/databaseName", "root", "root");
			PreparedStatement query = conn.prepareStatement("select * from tabela");
			
			//........
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
