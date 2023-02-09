package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		if (n > 0 && n % 2 == 0)
		System.out.println("O número " + n + " é par e positivo.");
		else if (n > 0 && n % 2 != 0)
		System.out.println("O número " + n + " é impar e positivo.");
		else if (n < 0 && n % 2 == 0)
		System.out.println("O número " + n + " é par e negativo.");
		else if (n < 0 && n % 2 != 0)
		System.out.println("O número " + n + " é impar e negativo.");
		else
			System.out.println("O número 0 não se enquadra nos padrões estabelecidos");
		
		
		leia.close();
	}

}
