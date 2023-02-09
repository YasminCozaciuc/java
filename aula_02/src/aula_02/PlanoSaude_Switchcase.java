package aula_02;

import java.util.Scanner;

public class PlanoSaude_Switchcase {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int faixa;
		
		System.out.println("Faixas Etárias:");
		System.out.println("1 - Até 10 anos");
		System.out.println("2 - De 11 a 29 anos");
		System.out.println("3 - De 30 a 45 anos");
		System.out.println("4 - De 46 a 59 anos");
		System.out.println("5 - De 60 a 65 anos");
		System.out.println("6 - Maior que 66 anos");
		
		System.out.println("Digite o número correspondente a sua faixa etária: ");
		faixa = leia.nextInt();
		
		switch(faixa) {		
		case 1:
			System.out.println("O valor do seu plano de saúde é R$100,00");
			break;
		case 2:
			System.out.println("O valor do seu plano de saúde é R$200,00");
			break;
		case 3:
			System.out.println("O valor do seu plano de saúde é R$300,00");
			break;
		case 4:
			System.out.println("O valor do seu plano de saúde é R$500,00");
			break;
		case 5:
			System.out.println("O valor do seu plano de saúde é R$600,00");
			break;
		case 6:
			System.out.println("O valor do seu plano de saúde é R$1000,00");
			break;
		default:
			System.out.println("Faixa etária Inválida!");
		}
		
		
		leia.close();

	}

}
