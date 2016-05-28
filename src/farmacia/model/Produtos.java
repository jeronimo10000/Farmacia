package farmacia.model;

public class Produtos {

	private int id;
	private String descricao;
	private double valorUnitario;

	public Produtos() {
		super();
	}

	public Produtos(int id, String descricao, double valorUnitario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
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

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produtos [id=").append(id).append(", descricao=").append(descricao).append(", valorUnitario=")
				.append(valorUnitario).append("]");
		return builder.toString();
	}

}
