package exercicio_lacoderepeticao;

import java.util.Scanner;

public class LacoWhile_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		while(idade >=0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
		}
		
		
		leia.close();
	}

}
