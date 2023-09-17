package Collections;

import java.util.TreeSet;
import java.util.Scanner;

/*
 * Leia um conjunto de nomes de pessoas. Exiba-os em ordem alfab�tica crescente 
*/

// Um objeto set (feito)
// Um objeto scanner (feito)
// La�o de repeti��o at� o usu�rio desejar sair (feito)
// Leitura de nomes e uma forma de adicionar ao conjunto (feito)
// Ordena��o do conjunto em ordem alfab�tica crescente (feito) Obs: a classe TreeSet j� ordena seus elementos
// Exibi��o dos nomes j� ordenados (feito)

public class PessoasNomes {
	public static void main(String[] args) {
		// Declara��o de objeto Scanner
		Scanner input = new Scanner(System.in);
		// Declara��o de um conjunto da classe TreeSet()
		TreeSet<String> pessoas = new TreeSet<String> ();
		
		String nome;
		int opcao;
		boolean continuar = true;
		
		while (continuar == true) {
			// Input do usu�rio
			System.out.print("Digite um novo nome: ");
			nome = input.nextLine();
			
			System.out.println();
			
			pessoas.add(nome); // Adi��o de nome ao conjunto
			
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
