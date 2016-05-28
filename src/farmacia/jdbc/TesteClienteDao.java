package farmacia.jdbc;

import farmacia.jdbc.dao.ClientesDao;
import farmacia.model.Clientes;

public class TesteClienteDao {
	public static void main(String[] args) {
		
		// pronto para gravar
		Clientes cliente = new Clientes();
		cliente.setId(0);
		cliente.setCpf("045.256.256-89");
		cliente.setNome("jeronimo");
		cliente.setEndereco("Rua: Pedro da Costa Agra Nº 16");
		cliente.setTelefone("083 3365-9874");
		
		//grave nessa conexão
		ClientesDao dao = new ClientesDao();
		dao.adiciona(cliente);
		
		System.out.println("Gravado!");

//		// pronto para gravar
//		Clientes cliente = new Clientes();
//		cliente.setId(1);
//		cliente.setCpf("076.254.689-62");
//		cliente.setNome("Cunha");
//		cliente.setEndereco("Maria Honorato nº 36");
//		cliente.setTelefone("083 3345-4793");
//		cliente.setId(1);
//
//		// grave nessa conexão!!!
//		ClientesDao dao = new ClientesDao();
//
//		// método elegante 
//		dao.atualizar(cliente);
//
//		System.out.println("Atualizado!");
		
		
//		//pronto para atualizar
//		Clientes cliente = new Clientes();
//		cliente.setId(2);
//		
//		// grave nessa conexão!!!
//		ClientesDao dao = new ClientesDao();
//		
//		dao.remover(cliente);
//		
//		System.out.println("Removido!");
	}
}
