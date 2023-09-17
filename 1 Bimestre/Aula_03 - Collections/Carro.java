
public class Carro extends Veiculo {
	private String modelo;
	private String cor;
	
	public Carro() {
		super();
		this.modelo = "";
		this.cor = "";
	}
	
	public Carro(String placa, String modelo, String cor) {
		super(placa);
		this.modelo = modelo;
		this.cor = cor;
	}
	
	// Métodos Getters / Setters
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
	
	// Método equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Carro temp = (Carro) obj;
		
		// Atributo placa (Super classe)
		if (this.getPlaca() == null) {
			if (temp.getPlaca() != null) {
				return false;
			}
		} else if (!this.getPlaca().equals(temp.getPlaca())) {
			return false;
		}
		
		// Atributo modelo
		if (this.modelo == null) {
			if (temp.modelo != null) {
				return false;
			}
		} else if (!this.modelo.equals(temp.modelo)) {
			return false;
		}
		
		// Atributo cor
		if (this.cor == null) {
			if (temp.cor != null) {
				return false;
			}
		} else if (!this.cor.equals(temp.cor)) {
			return false;
		}
		
		return true;
	}
	
	public int hashCode() {
		int primo = 29;
		int resultado = super.hashCode(); // Recebe o hashCode da super classe
		resultado = resultado * primo + ((this.modelo == null) ? 0 : this.modelo.hashCode());
		resultado = resultado * primo + ((this.cor == null) ? 0 : this.cor.hashCode());
		return resultado;
	}
	
	public String toString() {
		return super.toString() + " [Modelo: " + this.modelo + ", Cor: " + this.cor + "]";
	}
}




