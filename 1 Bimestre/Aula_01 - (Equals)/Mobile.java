package exercicios;

public class Mobile {
	private String marca;
	private String modelo;
	
	public Mobile() {
		this.marca = "";
		this.modelo = "";
	}
	
	public Mobile(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Mobile(String marca) {
		this.marca = marca;
		this.modelo = "";
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Mobile outro = (Mobile) obj;
		
		// Atributo marca
		if (this.marca == null) {
			if (outro.marca != null)
				return false;
		} else if (!this.marca.equals(outro.marca)) {
			return false;
		}
		
		// Atributo modelo
		if (this.modelo == null) {
			if (outro.modelo != null)
				return false;
		} else if (!this.modelo.equals(outro.modelo)) {
			return false;
		}
		
		return true;
	}
	
	public String toString() {
		return "[Marca: " + this.marca + " , Modelo: " + this.modelo + "]";
	}
}
