package farmacia.model;

public class Fornecedores {

	private int id;
	private String descricao;

	public Fornecedores() {
		super();
	}

	public Fornecedores(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornecedores [id=").append(id).append(", descricao=").append(descricao).append("]");
		return builder.toString();
	}

}
