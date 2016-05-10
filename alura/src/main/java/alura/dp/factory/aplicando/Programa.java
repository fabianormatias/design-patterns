package alura.dp.factory.aplicando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

	public static void main(String[] args) {
		try {
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement query = conn.prepareStatement("select * from tabela");
			
			//........
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
