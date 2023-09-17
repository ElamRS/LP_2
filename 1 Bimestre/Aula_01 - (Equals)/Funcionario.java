package exercicios;

public class Funcionario extends Pessoa {
	private String rg;
	private String cpf;
	
	public Funcionario() {
		super();
		this.rg = "";
		this.cpf = "";
	}
	
	public Funcionario(String nome, Integer ano, Integer mes, Integer dia, String rg, String cpf) {
		super(nome, ano, mes, dia);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return super.toString() + "[RG: " + this.rg + " , CPF: " + this.cpf + "]";
	}
}
