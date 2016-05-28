package farmacia.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import farmacia.jdbc.ConnectionFactory;
import farmacia.model.Clientes;

public class ClientesDao {

	private Connection connection;

	public ClientesDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Clientes cliente) {
		String sql = "insert into clientes " + "(idclientes,cpfCliente,nomeCliente,enderecoCliente,telefoneCliente)"
				+ " values (?,?,?,?,?)";

		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getNome());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getTelefone());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// atualiza a informação no banco
	public void atualizar(Clientes cliente) {
		String sql = "update clientes SET idclientes=?, cpfCLiente=?,"
				+ "nomeCliente=?, enderecoCliente=?, telefoneCliente=? where idclientes=?";

		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getNome());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getTelefone());
			stmt.setInt(6, cliente.getId());

			// executa
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remover(Clientes cliente) {

		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement("delete from clientes where idclientes=?");
			// seta os valores
			stmt.setInt(1, cliente.getId());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
