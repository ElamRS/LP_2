package data;

public class Relogio {
	private String marca;
	private String cor;
	private Boolean tamanho; // Grande ou Pequeno
	
	public Relogio() {
		this.marca = "";
		this.cor = "";
		this.tamanho = false;
	}
	
	public Relogio(String marca, String cor, Boolean tamanho) {
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public Relogio (String marca, Boolean tamanho) {
		this.marca = marca;
		this.cor = "";
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
	
	public Boolean getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(Boolean tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Relogio outro = (Relogio) obj;
		// Atributo marca
		if (this.marca == null) {
			if (outro.marca != null)
				return false;
		} else if (!this.marca.equals(outro.marca)) {
			return false;
		}
		
		// Atributo cor
		if (this.cor == null) {
			if (outro.cor != null) {
				return false;
			}
		} else if (!this.cor.equals(outro.cor)) {
			return false;
		}
		
		// Atributo tamanho
		if (this.tamanho == null) {
			if (outro.tamanho != null) {
				return false;
			}
		} else if (!this.tamanho.equals(outro.tamanho)) {
			return false;
		}
		
		return true;
	}
	
	public String toString() {
		return "[Marca: " + this.marca + ", Cor: " + this.cor + ", Tamanho: " + this.tamanho + "]";
	}
	
	public int hashCode() {
		final int primo = 31;
		int resultado = 1;
		resultado = primo * resultado + (this.marca == null ? 0 : this.marca.hashCode());
		resultado = primo * resultado + (this.cor == null ? 0 : this.cor.hashCode());
		resultado = primo * resultado + (this.tamanho == null ? 0 : this.tamanho.hashCode());
		return resultado;
	}
}
