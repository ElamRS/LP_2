package Collections;

import java.util.ArrayList;
import java.util.Scanner;

// Ler conjunto de salário do usuário e armazenar em um objeto ArrayList
// Deve ser passado o valor -1 para se terminar a entrada de valores
// O programa deve ler um valor do reajuste salarial e em seguida imprimir na tela os valores já reajustados

public class Salarios {
	// Declaração do objeto Scanner
	private static Scanner input = new Scanner(System.in);
	// Declaração do ArrayList salarios
	private static ArrayList<Double> salarios = new ArrayList<Double> ();
	
	public static void main(String[] args) {
		adicionarSalarios();
		reajuste();
		mostrarSalarios();
		
		input.close();
	}
	
	public static void adicionarSalarios() {
		Double salario;
		int sair;
		
		do {
			System.out.print("Digite um salario: ");
			salario = input.nextDouble();
			
			System.out.println();
			
			System.out.print("Adicionar outro salario? [Digite -1 para sair]: ");
			sair = input.nextInt();
			
			System.out.println();
			
			input.nextLine();
		} while (sair != -1);
	}
	
	public static void reajuste() {
		Double reajuste;
		
		System.out.print("Valor com o qual reajustar os salarios: ");
		reajuste = input.nextDouble();
		
		for (int i = 0; i < salarios.size(); i++) {
			salarios.set(i, reajuste);
		}
		
		System.out.println();
	}
	
	public static void mostrarSalarios() {
		int j = 1;
		for (Double s : salarios) {
			System.out.printf("%do Salario: %d", j, s);
			j++;
		}

		input.nextLine();
	}
}
