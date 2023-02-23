package atividade_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class variavel {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.#");
	
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média final é: " + df.format(media));
	}

}
