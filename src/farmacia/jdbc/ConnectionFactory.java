package farmacia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia", "root", "mago");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao abrir conexão em ConnectionFactory", e);
	}
	}
}
