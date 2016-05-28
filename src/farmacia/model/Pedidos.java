package farmacia.model;

public class Pedidos {

	private int id;
	private String descricao;
	private double valorTotal;

	public Pedidos() {
		super();
	}

	public Pedidos(int id, String descricao, double valorTotal) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
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

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
