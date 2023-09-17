import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class MetodosList {
	public static void main(String[] args) {
		// Declaracao do Objeto scanner
		Scanner sc = new Scanner(System.in);
		// Declaracao do ArrayList
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		int flag = -1;
		
		System.out.printf("| **** CONCESSIONARIA GRAN TURBO **** |\n\n");
		
		do {
			int opcao;
			
			System.out.println("1) Adicionar novo carro ao catalogo.");
			System.out.println("2) Mostrar carros do catalogo.");
			System.out.println("3) Verificar carro no catalogo.");
			System.out.println("4) Limpar catalogo.");
			
			System.out.print("\nopcao: ");
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			String modelo, cor, placa;
			
			switch (opcao) {
				case 1:
					int sair1 = -1;
					do {
						System.out.print("Digite o modelo: ");
						modelo = sc.nextLine();
						System.out.print("Digite a cor do veiculo: ");
						cor = sc.nextLine();
						System.out.print("Digite a placa: ");
						placa = sc.nextLine();

						Carro carro = new Carro(placa, modelo, cor);
						// Método add em ação
						carros.add(carro);

						System.out.print("Adicionar outro carro? [Digite '0' para sair]: ");
						sair1 = sc.nextInt();
						System.out.println();
					} while (sair1 != 0);
					break;
				case 2:
					Iterator<Carro> iterador = carros.iterator();
					
					while (iterador.hasNext()) {
						// Método iterator() em ação
						Carro c = iterador.next();
						
						System.out.println("\nPlaca: " + c.getPlaca());
						System.out.println("Cor: " + c.getCor());
						System.out.println("Modelo: " + c.getModelo());
						
						System.out.println();
					}
					sc.nextLine();
					break;
				case 3:
					int sair3 = -1;
					
					do {
						System.out.print("Digite o modelo: ");
						modelo = sc.nextLine();
						System.out.print("Digite a cor do veiculo: ");
						cor = sc.nextLine();
						System.out.print("Digite a placa: ");
						placa = sc.nextLine();
						
						Carro carro = new Carro(placa, modelo, cor);
						// Método contains() em ação
						if (carros.contains(carro)) {
							// Método indexOf() em ação
							System.out.printf("O carro pesquisado esta contido no indice %s do catalogo.\n", carros.indexOf(carro));
						}
						
						System.out.print("Pesquisar outro carro? [Digite '0' para sair]: ");
						sair3 = sc.nextInt();
						System.out.println();
					} while (sair3 != 0);
					break;
				case 4:
					int del;
					System.out.print("Voce tem certeza de que deseja deletar o catalogo? [Digite 1 para deletar]");
					del = sc.nextInt();
					
					if (del == 1) {
						carros.clear();
					}
					break;
				default:
					System.out.println("Opcao invalida, tente novamente.\n");
					break;
			}
		} while (flag<0);
	}
}
