package lp2_matutino;

import java.time.LocalDate;

public class Navio {
	private String nome;
	private LocalDate funcionamento;
	
	public Navio() {
		this.nome = "";
		this.funcionamento = LocalDate.now();
	}
	
	public Navio(String nome, Integer ano, Integer mes, Integer dia) {
		this.nome = nome;
		this.funcionamento = LocalDate.of(ano, mes, dia);
	}
	
	public Navio(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getFuncionamento() {
		return this.funcionamento;
	}
	
	public void setFuncionamento(LocalDate funcionamento) {
		this.funcionamento = funcionamento;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Navio outro = (Navio) obj;
		
		// Atributo nome
		if (this.nome == null) {
			if (outro.nome != null)
				return false;
		} else if (!this.nome.equals(outro.nome)) {
			return false;
		}
		
		// Atributo funcionamento
		if (this.funcionamento == null) {
			if (outro.funcionamento != null)
				return false;
		} else if (!this.funcionamento.equals(outro.funcionamento)) {
			return false;
		}
		
		return true;
	}
	
	public String toString() {
		return "[Nome: " + this.nome + " , Funcionamento: " + this.funcionamento + "]"; 
	}
}
