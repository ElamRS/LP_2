package Collections;

import java.util.TreeSet;
import java.util.Scanner;

/*
 * Leia um conjunto de nomes de pessoas. Exiba-os em ordem alfabética crescente 
*/

// Um objeto set (feito)
// Um objeto scanner (feito)
// Laço de repetição até o usuário desejar sair (feito)
// Leitura de nomes e uma forma de adicionar ao conjunto (feito)
// Ordenação do conjunto em ordem alfabética crescente (feito) Obs: a classe TreeSet já ordena seus elementos
// Exibição dos nomes já ordenados (feito)

public class PessoasNomes {
	public static void main(String[] args) {
		// Declaração de objeto Scanner
		Scanner input = new Scanner(System.in);
		// Declaração de um conjunto da classe TreeSet()
		TreeSet<String> pessoas = new TreeSet<String> ();
		
		String nome;
		int opcao;
		boolean continuar = true;
		
		while (continuar == true) {
			// Input do usuário
			System.out.print("Digite um novo nome: ");
			nome = input.nextLine();
			
			System.out.println();
			
			pessoas.add(nome); // Adição de nome ao conjunto
			
			System.out.print("Adicionar outro nome? [Digite '-1' para sair, outro numero para continuar]: ");
			opcao = input.nextInt();
			input.nextLine();
			
			System.out.println();
			
			if (opcao == -1) {
				continuar = false;
			}
		}
		
		System.out.print("[ ");
		
		for (String pessoa : pessoas) {
			System.out.print(pessoa + " ");
		}
		
		System.out.print("]");
		input.close();
	}
}
