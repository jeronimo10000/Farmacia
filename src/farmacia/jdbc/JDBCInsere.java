package farmacia.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import farmacia.jdbc.ConnectionFactory;

public class JDBCInsere {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			con = new ConnectionFactory().getConnection();
			// faz um monte de operações.
			// que podem lançar exceptions runtime e SQLException
		} finally {
			con.close();
		}
		
	}
}
