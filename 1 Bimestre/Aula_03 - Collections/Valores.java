import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Escreva um ArrayList de inteiros de nome "valores" dentro de uma fun��o main
// O usu�rio dever� informar 5 valores inteiros que
// devem ser adicionados individualmente no ArrayList
// Os valores passados devem ser impressos de forma individual atrav�s
// de um la�o for

public class Valores {
	public static void main(String[] args) {
		// Objeto da classe Scanner
		Scanner sc = new Scanner(System.in);
		// Declara��o do ArrayList valores 
		ArrayList<Integer> valores = new ArrayList<Integer>();

		int flag = 0;
		Integer value;
		
		do {
			try {
				System.out.print("Digite um valor inteiro: ");
				value = sc.nextInt();
				valores.add(value);
			} catch(InputMismatchException e) {
				System.out.println("Numero inteiro nao digitado. Tente novamente.");
				flag--;
			}
			sc.nextLine();
			flag++;
		} while (flag<5);
		
		System.out.print("\nValores: ");
		
		for (int i=0; i<valores.size(); i++) {
			System.out.print(valores.get(i) + " ");
		}
	}
}
