package lista_04;

import java.time.LocalDate;

public class RG {
	// Atributos
	private String numero;
	private LocalDate nascimento;
	// Construtores
	public RG() {
		this.numero = "";
		this.nascimento = LocalDate.now();
	}
	
	public RG(String numero, Integer ano, Integer mes, Integer dia) {
		this.numero = numero;
		this.nascimento = LocalDate.of(ano, mes, dia);
	}
	// Getters / Setters
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public LocalDate getNascimento() {
		return this.nascimento;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	// Método equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		RG temp = (RG) obj;
		// Atributo número
		if (this.numero == null) {
			if (temp.numero != null) {
				return false;
			}
		} else if (!this.numero.equals(temp.numero)) {
			return false;
		}
		// Atributo nascimento
		if (this.nascimento == null) {
			if (temp.nascimento != null) {
				return false;
			}
		} else if (!this.nascimento.equals(temp.nascimento)) {
			return false;
		}
		
		return true;
	}
	
	// Método hashCode
	public int hashCode() {
		int primo = 31;
		int result = 1;
		result = result * primo + ((this.numero == null) ? 0 : this.numero.hashCode());
		result = result * primo + ((this.nascimento == null) ? 0 : this.nascimento.hashCode());
		return result;
	}
	
	// Método toString()
	public String toString() {
		return "[Numero: " + this.numero + " , Nascimento: " + this.nascimento + "]";
	}
}
