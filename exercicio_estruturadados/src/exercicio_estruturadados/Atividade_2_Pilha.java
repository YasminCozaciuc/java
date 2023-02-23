package exercicio_estruturadados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade_2_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		int opcao =0;
		String livro;
		
		do {
			System.out.println("\n************************************************");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar um livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("************************************************");
			System.out.println("Entre com a opção desejada:");
		
			opcao = leia.nextInt();
			leia.skip("\\R?");

		switch(opcao) {
		
		case 1:
			System.out.println("Digite o nome do livro a ser adicionado: ");
			livro = leia.nextLine();
			pilha.add(livro);
			System.out.println("Livro Adicionado!");
			break;
			
		case 2:
			System.out.println("Listar todos os livros: ");
			pilha.forEach(System.out::println);
			break;
		case 3:
			if(pilha.isEmpty()) 
				System.out.println("A pilha está vazia!!");
				else
					System.out.println("Digite o livro a ser removido: ");
				livro = leia.nextLine();
				pilha.remove(livro);
				System.out.println("Um Livro foi retirado da pilha!");
				break;	
			
		}
		}while(opcao != 0);
		System.out.println("Programa Finalizado!");
			
		leia.close();
	}

}
