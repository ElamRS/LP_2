package lp2_matutino;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.cor = "";
	}
	
	public Carro(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public Carro (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = "";
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
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "[Marca: " + this.marca + " ,Modelo: " + this.modelo + " ,Cor: " + this.cor;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Checa se o objeto que passou o equals é igual ao objeto passado
		if (this == obj)
			return true;
		// Se o objeto for nulo, é retornado falso
		if (obj == null)
			return false;
		// Avalia se as classes dos dois objetos são iguais 
		if (this.getClass() != obj.getClass())
			return false;
		
		Carro other = (Carro) obj;
		
		// Atributo marca
		if (this.marca == null) {
			if (other.marca != null)
				return false;
		} else if (!this.marca.equals(other.marca)) {
			return false;
		}
		
		// Atributo modelo
		if (this.modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!this.modelo.equals(other.modelo)) {
			return false;
		}
		
		// Atributo cor
		if (this.cor == null) {
			if (other.cor != null)
				return false;
		} else if (!this.cor.equals(other.cor)) {
			return false;
		}
		
		return true;
	}
	
	public int hashCode() {
		final int primo = 31;
		int resultado = 1;
		resultado = primo * resultado + (this.marca == null ? 0 : marca.hashCode());
		resultado = primo * resultado + (this.modelo == null ? 0 : modelo.hashCode());
		resultado = primo * resultado + (this.cor == null ? 0 : cor.hashCode());
		return resultado;
	}
}
