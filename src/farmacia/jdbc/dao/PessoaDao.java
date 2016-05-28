package farmacia.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import farmacia.jdbc.ConnectionFactory;
import farmacia.model.Pessoa;

public class PessoaDao {
	
	private Connection connection;
	
	public PessoaDao() {
		this.connection = new ConnectionFactory().getConnection();
		}
	
	public void adiciona(Pessoa cliente) {
		String sql = "insert into pessoa " +
		"(idpessoa,cpf,nome,endereco,telefone)" +
		" values (?,?,?,?,?)";
	
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1,cliente.getId());
			stmt.setString(2,cliente.getCpf());
			stmt.setString(3,cliente.getNome());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getTelefone());
			
			// executa
			stmt.execute();
			stmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
		
	}
	
	public void atualizar(Pessoa cliente) {
		String sql = "update pessoa set idpessoa=?, nome=?,"+
				"cpf=?, endereco=?, telefone=? where id=?";
	
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setInt(1,cliente.getId());
			stmt.setString(2,cliente.getNome());
			stmt.setString(3,cliente.getCpf());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getTelefone());
			
			// executa
			stmt.execute();
			stmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
	}
	
	public void remover(Pessoa cliente) {
		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement("delete from clientes where idpessoa=?");
			// seta os valores
			stmt.setInt(1,cliente.getId());
	
			// executa
			stmt.execute();
			stmt.close();
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
		
	}
		
}
