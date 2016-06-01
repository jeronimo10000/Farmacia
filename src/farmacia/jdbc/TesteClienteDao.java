package farmacia.jdbc;

import java.util.Scanner;

import farmacia.jdbc.dao.ClientesDao;
import farmacia.model.Clientes;

public class TesteClienteDao {
	public static void main(String[] args) {
		
//		Scanner gravar = new Scanner(System.in);
//		
//		System.out.println("Cadastro de Clientes!");
//		System.out.println("Digite o cpf: ");
//		String cpf = gravar.nextLine();
//		System.out.println("Digite o nome: ");
//		String nome = gravar.nextLine();
//		System.out.println("Digite o endereço: ");
//		String endereco = gravar.nextLine();
//		System.out.println("Digite o telefone: ");
//		String telefone = gravar.nextLine();
//		
//		// pronto para gravar
//		Clientes cliente = new Clientes();
//		cliente.setId(0);
//		cliente.setCpf(cpf);
//		cliente.setNome(nome);
//		cliente.setEndereco(endereco);
//		cliente.setTelefone(telefone);
//		
//		//grave nessa conexão
//		ClientesDao dao = new ClientesDao();
//		dao.adiciona(cliente);
//		
//		System.out.println("Gravado!");
		
//		Scanner atualizar = new Scanner(System.in);
//		
//		System.out.println("Atualizar Cliente!");
//		System.out.println("Digite o cpf: ");
//		String cpf = atualizar.nextLine();
//		System.out.println("Digite o nome: ");
//		String nome = atualizar.nextLine();
//		System.out.println("Digite o endereço: ");
//		String endereco = atualizar.nextLine();
//		System.out.println("Digite o telefone: ");
//		String telefone = atualizar.nextLine();
//		System.out.println("Digite o código do Cliente");
//		int id = atualizar.nextInt();
//		
//		// pronto para atualizar
//		Clientes cliente = new Clientes();
//		cliente.setId(0);
//		cliente.setCpf(cpf);
//		cliente.setNome(nome);
//		cliente.setEndereco(endereco);
//		cliente.setTelefone(telefone);
//		cliente.setId(id);
//
//		// grave nessa conexão!!!
//		ClientesDao dao = new ClientesDao();
//
//		// método elegante 
//		dao.atualizar(cliente);
//
//		System.out.println("Atualizado!");
		
		Scanner remover = new Scanner(System.in);
		System.out.println("Remover Cliente");
		System.out.println("Digite o código do cliente para remover");
		int id = remover.nextInt();
		
		//pronto para remover
		
		Clientes cliente = new Clientes();
		cliente.setId(id);
		
		// grave nessa conexão!!!
		ClientesDao dao = new ClientesDao();
		
		dao.remover(cliente);
		
		System.out.println("Removido!");
	}
}
