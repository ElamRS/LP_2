package lista_04;

public class Pessoa {
	private String nome;
	private RG identidade;
	// Construtores
	public Pessoa() {
		this.nome = "";
		this.identidade = new RG();
	}
	
	public Pessoa(String numero, Integer ano, Integer mes, Integer dia, String nome) {
		this.nome = nome;
		this.identidade = new RG(numero, ano, mes, dia);
	}
	// Getters / Setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public RG getIdentidade() {
		return this.identidade;
	}
	
	public void setIndentidade(RG identidade) {
		this.identidade = identidade;
	}
	
	// Método equals
	public boolean equals(Object obj) {
		if (this == null)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Pessoa temp = (Pessoa) obj;
		// Atributo nome
		if (this.nome == null) {
			if (temp.nome != null) {
				return false;
			}
		} else if (!this.nome.equals(temp.nome)) {
			return false;
		}
		
		// Atributo identidade
		if (this.identidade == null) {
			if (temp.identidade != null) {
				return false;
			}
		} else if (!this.identidade.equals(temp.identidade)) {
			return false;
		}
		
		return true;
	}
	
	// Método HashCode
	public int hashCode() {
		int primo = 31;
		int resultado = 1;
		resultado = resultado * primo + ((this.nome == null) ? 0 : this.nome.hashCode());
		resultado = resultado * primo + ((this.identidade == null) ? 0 : this.identidade.hashCode());
		return resultado;
	}
	
	// Método toString
	public String toString() {
		return "[Nome: " + this.nome + "]" + identidade.hashCode();
	}
}
