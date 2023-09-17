package Collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/* 1) A classe Collections é uma classe que contém apenas métodos estáticos e é utilizada
 *    para manipular ou retornar coleções de objetos.
 *    
 *    Todos os seus métodos possuem controles que garantem que será retornada uma exceção
 *    caso seja passado um objeto ou coleção nulo.
 *    
 *    Foi adicionado à linguagem na versão 1.2 do Java.
*/

// Faça um programa Java que demonstre o funcionamento da classe Collections

public class CollectionsFuncionalidades {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> notas = new ArrayList<Integer> ();
		
		boolean sair = false;
		
		do {
			int opcao;
			
			System.out.println("1) Adicionar notas.");
			System.out.println("2) Mostrar notas obtidas.");
			System.out.println("3) Ordenar notas de forma crescente.");
			System.out.println("4) Obter frequencia de uma nota.");
			System.out.println("0) Sair do menu.\n");
			
			System.out.print("Opcao: ");
			opcao = input.nextInt();
			
			input.nextLine();
			
			switch (opcao) {
				case 1:
					Integer nota;
					Integer continuar;
					
					do {
						System.out.print("\nAdicionar nota: ");
						nota = input.nextInt();
						
						notas.add(nota); // Adiciona a nota na lista					
						System.out.println();
	
						System.out.print("Deseja continuar? [Digite 0 Para sair]: ");
						continuar = input.nextInt();
						
						input.nextLine();
					} while (continuar != 0);
					break;
				case 2:
					int i = 1;
					for (int n : notas) {
						System.out.printf("%do Nota: %d\n", i, n);
						i++;
					}
					System.out.println();
					input.nextLine();
					System.out.println();
					break;
				case 3:
					Collections.sort(notas); // Método sort() em uso
					
					System.out.println("Notas ordenadas com sucesso.");
					input.nextLine();
					break;
				case 4:
					Integer ficar, n;
					
					do {
						System.out.print("Nota a se buscar: ");
						n = input.nextInt();
						// Método frequency() sendo utilizado.
						System.out.printf("A nota %d aparece %d vezes.\n", n, Collections.frequency(notas, n));
						
						System.out.print("Pesquisar outra nota? [Digite 0 para sair]:");
						ficar = input.nextInt();
					} while (ficar != 0);
					break;
				case 0:
					sair = true;
					break;
				default:
					System.out.println("Opcao invalida escolhida, tente novamente.");
					break;
			}
		} while (sair == false);
		
		input.close();
	}
}
