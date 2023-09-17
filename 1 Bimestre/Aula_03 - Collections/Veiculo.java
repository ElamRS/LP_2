
public class Veiculo {
	private String placa;
	
	// Construtores
	public Veiculo() {
		this.placa = "";
	}
	
	public Veiculo(String placa) {
		this.placa = placa;
	}
	// Getters / Setters
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	// Método equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Veiculo temp = (Veiculo) obj;
		
		if (this.placa==null) {
			if (temp.placa!=null) {
				return false;
			}
		} else if (!this.placa.equals(temp.placa)) {
			return false;
		}
		
		return true;
	}
	
	public int hashCode() {
		int primo = 29;
		int resultado = 1;
		resultado = resultado * primo + ((this.placa == null) ? 0 : this.placa.hashCode());
		return resultado;
	}
	
	public String toString() {
		return "[Placa: " + this.placa + "]";
	}
}
