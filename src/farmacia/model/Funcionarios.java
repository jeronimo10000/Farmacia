package farmacia.model;

public class Funcionarios extends Pessoa {

	private double salarioBase;
	private double comSalario;

	public Funcionarios() {
		super();
	}

	public Funcionarios(int id, String cpf, String nome, String endereco, String telefone) {
		super(id, cpf, nome, endereco, telefone);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComSalario() {
		return comSalario;
	}

	public void setComSalario(double comSalario) {
		this.comSalario = comSalario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionarios [salarioBase=").append(salarioBase).append(", comSalario=").append(comSalario)
				.append("]");
		return builder.toString();
	}

}
