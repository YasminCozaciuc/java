package exercicio_estruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_1_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = 0;
		String cliente;
	
		do {
			System.out.println("\n************************************************");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Chamar (retirar) uma pessoa da fila ");
			System.out.println("0 - Sair");
			System.out.println("************************************************");
			System.out.println("Digite a opção desejada:");
			
			opcao = leia.nextInt();
			leia.skip("\\R?");
		
		switch(opcao) {
		
		case 1:
			System.out.println("Digite o nome do cliente a ser adicionado: ");
			cliente = leia.nextLine();
			fila.add(cliente);
			System.out.println("Cliente Adicionado!");
			break;
		
		case 2:
			System.out.println("Listar todos os clientes: ");
			fila.forEach(System.out::println);
			break;
			
		case 3:
			if(fila.isEmpty())
				System.out.println("A lista está vazia!");
			else
			System.out.println("Digite o cliente a ser removido: ");
			cliente = leia.nextLine();
			fila.remove(cliente);
			System.out.println("Cliente foi chamado!");
			break;
		}
		
		} while (opcao != 0);
		System.out.println("Programa Finalizado!");
		
		
		
		
		
		leia.close();
		
	}
}