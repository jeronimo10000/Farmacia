package farmacia.jdbc;

import java.util.Scanner;

import farmacia.jdbc.dao.ClientesDao;
import farmacia.model.Clientes;

public class TesteClienteDao {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o cpf: ");
		String cpf = ler.next();
		System.out.println("Digite o nome: ");
		String nome = ler.next();
		System.out.println("Digite o endereço: ");
		String endereco = ler.next();
		System.out.println("Digite o telefone: ");
		String telefone = ler.next();
		
		// pronto para gravar
		Clientes cliente = new Clientes();
		cliente.setId(0);
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		
		//grave nessa conexão
		ClientesDao dao = new ClientesDao();
		dao.adiciona(cliente);
		
		System.out.println("Gravado!");
		
//		// pronto para gravar
//		Clientes cliente = new Clientes();
//		cliente.setId(0);
//		cliente.setCpf("045.256.256-89");
//		cliente.setNome("jeronimo");
//		cliente.setEndereco("Rua: Pedro da Costa Agra Nº 16");
//		cliente.setTelefone("083 3365-9874");
//		
//		//grave nessa conexão
//		ClientesDao dao = new ClientesDao();
//		dao.adiciona(cliente);
//		
//		System.out.println("Gravado!");

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
