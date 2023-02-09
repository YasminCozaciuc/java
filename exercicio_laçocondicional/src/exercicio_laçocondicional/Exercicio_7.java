package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2;
		int codigo;
		
		System.out.println("Código da Operação::");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		System.out.println("Digite um número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite outro número: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o número da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.println (n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));			
			break;
		default:
			System.out.println("Operação Inválida!");
		}
		
		leia.close();
	}

}
