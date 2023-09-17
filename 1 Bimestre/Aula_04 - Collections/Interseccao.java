package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class Interseccao {
	public static void main(String[] args) {
		// Declaração do objeto da classe Scanner
		Scanner input = new Scanner(System.in);
		// Conjuntos de números inteiros
		HashSet<Integer> conjunto1 = new HashSet<Integer> ();
		HashSet<Integer> conjunto2 = new HashSet<Integer> ();
		
		boolean continuar = true;
		Integer temp, opcao;
		
		// Leitura dos dados do 1o conjunto
		while (continuar == true) {
			System.out.print("Novo elemento do 1o conjunto: ");
			temp = input.nextInt();
			
			conjunto1.add(temp);
			
			System.out.println();
			
			System.out.print("Deseja adicionar outro elemento? [Digite -1 para sair]: ");
			opcao = input.nextInt();
			
			System.out.println();
			
			if (opcao == -1) {continuar = false;}
		}
		
		// Leitura dos dados do 2o conjunto, uma vez que o tamanho do 1o é conhecido
		for (int i = 0; i < conjunto1.size(); i++) {
			System.out.print("Novo elemento do 2o conjunto: ");
			temp = input.nextInt();
			
			conjunto2.add(temp);
		}
		
		System.out.println();
		
		// Adquire a intersecção do conjunto1 com o conjunto2 utilizando o método retainAll() da interface Set
		conjunto1.retainAll(conjunto2);
		
		System.out.println("Conjunto formado pela interseccao entre os dois conjuntos: \n");
		
		for (Integer valor : conjunto1) {
			System.out.print(valor + " ");
		}
		
		input.close();
	}
}
