package exercicios;

public class Aviao {
	private String fabricante;
	private String tipo;
	
	public Aviao() {
		this.fabricante = "";
		this.tipo = "";
	}
	
	public Aviao(String fabricante, String tipo) {
		this.fabricante = fabricante;
		this.tipo = tipo;
	}
	
	public Aviao(String tipo) {
		this.tipo = tipo;
		this.fabricante = "";
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass()) { 
			return false;
		}
		
		Aviao temp = (Aviao) obj;
		
		// Atributo fabricante
		if (this.fabricante == null) {
			if (temp.fabricante != null) 
				return false;
		} else if (!this.fabricante.equals(temp.fabricante)) {
			return false;
		}
		
		// Atributo tipo
		if (this.tipo == null) {
			if (temp.tipo != null)
				return false;
		} else if (!this.tipo.equals(temp.tipo)) {
			return false;
		}
		
		return true;
	}
	
	public String toString() {
		return "[Fabricante: " + this.fabricante + ", Tipo: " + this.tipo + "]";
	}
}
