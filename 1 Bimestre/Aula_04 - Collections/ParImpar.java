package Collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

// Declarar um objeto do tipo ArrayList (feito)
// Declarar duas listas, uma delas 'par' e a outra 'impar' (feito)
// Ler n�meros do usu�rio e armazena-los no ArrayList at� que o usu�rio deseje parar (feito)
// Separar os n�meros pares e impares do vetor e coloc�-los em um vetor 'par' e outro 'impar' (feito)

public class ParImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<> ();
		ArrayList<Integer> par = new ArrayList<Integer> ();
		ArrayList<Integer> impar = new ArrayList<Integer> ();
		
		Integer numero, sair;
		
		do {
			System.out.print("Digite um novo numero: ");
			numero = input.nextInt();
			
			System.out.println();
			
			numeros.add(numero);
			
			System.out.print("Deseja adicionar outro numero? [Digite -1 para sair, ou outro para continuar]: ");
			try {
				sair = input.nextInt();
			} catch (InputMismatchException e) {
				sair = 0;
				System.out.println("Numero inteiro nao digitado, tente novamente.");
			}
			
			input.nextLine();
		} while (sair != -1);
		// Adicionar os n�meros pares a um array de numeros pares
		for (Integer n : numeros) {
			if (n % 2 == 0) {
				par.add(n);
			}
		}
		
		// Adicionar os n�meros impares a um arrya de numeros impares
		for (Integer n : numeros) {
			if (n % 2 == 1) {
				impar.add(n);
			}
		}
		
		System.out.println();
		
		System.out.println("N�meros Pares");
		for (Integer p : par) {
			System.out.print(p + " ");
		}
		
		System.out.println();
		
		System.out.println("N�meros Impares");
		for (Integer i : impar) {
			System.out.print(i + " ");
		}
	}
}
