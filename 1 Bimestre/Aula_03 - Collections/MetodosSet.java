import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class MetodosSet {
	public static void main(String[] args) {
		// Declaração do Objeto Scanner
		Scanner input = new Scanner(System.in);
		// Declaração do HashSet
		HashSet<String> paises = new HashSet<String>();
		
		int opcao = -1;
		
		do {
			System.out.println("| ***** PAISES ***** |\n");
			System.out.println("1) Adicionar pais.");
			System.out.println("2) Mostrar paises.");
			System.out.println("3) Apagar pais.");
			System.out.println("4) Pesquisar pais.");
			System.out.println("0) Fechar menu.\n");
			
			System.out.print("Opcao: ");
			opcao = input.nextInt();
			input.nextLine(); // Passar o buffer para a próxima linha
			
			String pais;
			
			switch (opcao) {
				case 1:
					int sair1;
					do {
						System.out.print("\nNome do pais: ");
						pais = input.nextLine();
						
						// Método add() em ação
						paises.add(pais);
						
						System.out.println("Deseja adicionar outro pais? [Digite '0' para sair]: ");
						sair1 = input.nextInt();
						input.nextLine();
					} while (sair1 != 0);
					break;
				case 2:
					Iterator<String> iterador = paises.iterator();
					// Método isEmpty sendo utilizado
					if (paises.isEmpty()) {
						System.out.println("O set nao contem nenhum pais. Tente adicionar alguma nacao.");
					} else {
						// Utilizacao do metodo size()
						System.out.printf("O set contem %s paises. Veja a lista abaixo.\n", paises.size());
						System.out.print("[ ");
						do {
							System.out.print(iterador.next() + "  ");
						} while (iterador.hasNext());
						System.out.println("]");
					}
					input.nextLine(); // Segura o buffer
					break;
				case 3:
					System.out.print("Qual pais deve ser deletado? ");
					pais = input.nextLine();
					// Método remove() sendo utilizado
					paises.remove(pais);
					break;
				case 4:
					int sair4;
					do {
						System.out.print("\nNome do pais: ");
						pais = input.nextLine();
						
						// Método contains() em ação
						if (paises.contains(pais)) {
							System.out.println("O pais procurado faz parte do set.");
						} else {
							System.out.println("Pais não encontrado.");
						}
						
						System.out.println("Deseja pesquisar outro pais? [Digite '0' para sair]: ");
						sair4 = input.nextInt();
						input.nextLine();
					} while (sair4 != 0);
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Opcao invalida, tente novamente.");
					break;
			}
			
		} while (opcao != 0);
	}
}
