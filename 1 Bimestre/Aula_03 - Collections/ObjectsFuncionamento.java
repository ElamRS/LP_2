import java.util.Objects;

public class ObjectsFuncionamento {
	public static void main(String[] args) {
		Carro carro1 = new Carro("ABCD-1234", "Ferrari", "Vermelho");
		Carro carro2 = new Carro("DCBA-4321", "Tesla", "Cinza");
		
		if (Objects.equals(carro1, carro2)) {
			System.out.println("Os objetos são iguais.");
		} else {
			System.out.println("Os objetos carro1 e carro2 são diferentes.");
		}
		
		System.out.println();
		
		System.out.println("Carro 1: " + Objects.toString(carro1));
		System.out.println("Carro 2: " + Objects.toString(carro2));
		
		System.out.println();
		
		System.out.println("HashCode carro 1: " + Objects.hashCode(carro1));
		System.out.println("HashCode carro 2: " + Objects.hashCode(carro2));
		
		System.out.println();
		
		System.out.println("Hash de carro 1 e carro 2: " + Objects.hash(carro1, carro2));
	}
}
