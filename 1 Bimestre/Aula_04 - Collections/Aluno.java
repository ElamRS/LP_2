package Collections;

public class Aluno extends Pessoa {
	private String prontuario;
	
	// Construtores
	public Aluno() {
		super();
		this.prontuario = "";
	}
	
	public Aluno(String numero, Integer ano, Integer mes, Integer dia, String nome, String prontuario) {
		super(numero, ano, mes, dia, nome);
		this.prontuario = prontuario;
	}
	
	// Getters / Setters
	public String getProntuario() {
		return this.prontuario;
	}
	
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	// Método equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Aluno temp = (Aluno) obj;
		
		if (this.prontuario == null) {
			if (temp.prontuario != null) {
				return false;
			}
		} else if (!this.prontuario.equals(temp.prontuario)) {
			return false;
		}
		
		return true;
	}
	
	// Método hashCode
	public int hashCode() {
		int primo = 31;
		int resultado = super.hashCode();
		resultado = resultado * primo + ((this.prontuario == null) ? 0 : this.prontuario.hashCode());
		
		return resultado;
	}
	// Método toString
	public String toString() {
		return super.toString() + "[Prontuario: " + this.prontuario + "]";
	}
}