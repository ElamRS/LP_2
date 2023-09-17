import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

// Fa�a um programa que armazene 10 valores aleat�rios em um ArrayList
// O programa dever� imprimir o maior e o menor valor armazenados no ArrayList

public class ListaAleatoria {

	public static void main(String[] args) {
		// Instanciamento objeto Random
		Random random = new Random();
		// Declara��o do ArrayList
		ArrayList<Integer> aleatorio = new ArrayList<Integer>();
		
		int flag = 0;
		
		do {
			Integer valor = random.nextInt(100);
			aleatorio.add(valor);
			flag++;
		} while (flag<10);
		
		Iterator<Integer> iterator = aleatorio.iterator();
		
		Integer menor=0, maior=0, i=0;
		
		while (iterator.hasNext()) {
			Integer num = iterator.next();
			
			// System.out.print(num + " ");
			
			if (i==0) {
				menor = num;
				maior = num;
				i++;
			}
			
			if (num < menor) {
				menor = num;
			} else if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}
