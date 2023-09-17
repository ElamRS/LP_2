
/*  
 *  Escreva o código fonte da classe Cadastro que armazene objetos da classe Carro, incluir os metodos:
	void cadastrar() - inclui um carro no cadastro;
	void listar() - lista todos carros armazenados no cadastro;
	void sair() - fim; 
 *
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Cadastro {
	ArrayList<Carro> cadastro = new ArrayList();
	
	public Cadastro() {
		int i = -1; 
		int flag = -1;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("\033\143"); // Limpa a tela e retorna o cursor ao início
			System.out.flush();
			System.out.println("||   Cadastro de Automoveis   ||\n");
			System.out.println("1) Cadastrar novo automovel.");
			System.out.println("2) Mostrar automoveis do cadastro.");
			System.out.println("0) Sair.\n");
			
			try {
				i = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um inteiro.");
			}
			
			switch (i) {
				case 1:
					cadastrar();
					break;
				case 2:
					listar();
					break;
				case 0:
					input.close();
					sair();
					break;
				default:
					System.out.println("Opção inválida escolhida.");
					break;
			}
		} while(flag<0);
	}
	
	public ArrayList getCadastro() {
		return this.cadastro;
	}
	
	public void setCadastro(ArrayList cadastro) {
		this.cadastro = cadastro;
	}
	
	public void cadastrar() {
		Scanner sc = new Scanner(System.in);
		
		// Atributo de marca
		System.out.print("Marca: ");
		String marca = sc.nextLine();
		// Atributo de modelo
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		// Atributo de cor
		System.out.print("Cor: ");
		String cor = sc.nextLine();
		
		// Instanciamento de Objeto Carro
		Carro carro = new Carro(marca, modelo, cor);
		
		cadastro.add(carro);
		sc.close();
	}
	
	public void listar() {
		Scanner sc = new Scanner(System.in);
		
		int n = cadastro.size();
		System.out.println(n);
		System.out.println("|| Veiculos Cadastrados ||");
		
		Carro carro = new Carro();
		
		for (int j=0; j<n; j++) {
			carro = cadastro.get(j);
			
			System.out.println("-------------------------------");
			System.out.println("Marca: " + carro.getMarca());
			System.out.println("Modelo: " + carro.getModelo());
			System.out.println("Cor: " + carro.getCor());
			System.out.println("-------------------------------");
			
			System.out.printf("\n");
		}
		sc.nextLine(); // Segura o output
	}
	
	public void sair() {
		System.exit(0);
	}
}
