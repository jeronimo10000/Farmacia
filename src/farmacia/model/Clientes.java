package farmacia.model;

public class Clientes extends Pessoa {

	private Pessoa cliente;

	public Clientes() {

	}

	public Clientes(int id, String cpf, String nome, String endereco, String telefone) {
		super(id, cpf, nome, endereco, telefone);
	}

	public Clientes(Pessoa cliente) {
		super();
		this.cliente = cliente;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

}
