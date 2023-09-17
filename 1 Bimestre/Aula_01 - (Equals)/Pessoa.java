package exercicios;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate nascimento;
	
	public Pessoa() {
		this.nome = "";
		this.nascimento = LocalDate.now();
	}
	
	public Pessoa(String nome, Integer ano, Integer mes, Integer dia) {
		this.nome = nome;
		this.nascimento = LocalDate.of(ano, mes, dia);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return this.nascimento;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	@Override
	public String toString() {
		return "[Nome: " + this.nome + " , Nascimento: " + this.nascimento + "]";
	}
}
