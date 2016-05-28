package farmacia.model;

public class Pessoa {

	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;

	public Pessoa() {
		super();
	}

	public Pessoa(int id, String cpf, String nome, String endereco, String telefone) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [id=").append(id).append(", cpf=").append(cpf).append(", nome=").append(nome)
				.append(", endereco=").append(endereco).append(", telefone=").append(telefone).append("]");
		return builder.toString();
	}

}
