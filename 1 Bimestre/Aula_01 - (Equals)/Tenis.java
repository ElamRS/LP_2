package exercicios;

public class Tenis {
	private String marca;
	private String cor;
	private Integer tamanho;
	
	public Tenis() {
		this.marca = "";
		this.cor = "";
		this.tamanho = 0;
	}
	
	public Tenis(String marca, String cor, Integer tamanho) {
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public Tenis(String marca, Integer tamanho) {
		this.marca = marca;
		this.tamanho = tamanho;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Integer getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean equals(Object obj) {
		if (this == null)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Tenis outro = (Tenis) obj;
		
		// Atributo marca
		if (this.marca == null) {
			if (outro.marca!=null)
				return false;
		} else if (!this.marca.equals(outro.marca)) {
			return false;
		}
		
		// Atributo cor
		if (this.cor == null) {
			if (outro.cor != null)
				return false;
		} else if (!this.cor.equals(outro.cor)) {
			return false;
		}
		
		// Atributo tamanho
		if (this.tamanho == null) {
			if (outro.tamanho != null)
				return false;
		} else if (!this.tamanho.equals(outro.tamanho)) {
			return false;
		}
		
		return true;
	}
	
	public String toString() {
		return "[Marca: " + this.marca + ", Cor: " + this.cor + ", Tamanho: " + this.tamanho;
	}
}
