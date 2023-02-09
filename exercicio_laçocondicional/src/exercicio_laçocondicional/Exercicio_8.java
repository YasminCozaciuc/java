package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int codigo;
		float saldo = 1000; 
		float saque, deposito;
		
		System.out.println("Código da Operação::");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		
		System.out.println("Digite a operação desejada: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Operação - Saldo" + "\nSaldo: R$" + saldo);
			break;
		case 2:
			System.out.println("Qual o valor a ser sacado? ");
			saque = leia.nextFloat();
			System.out.println("Operação - Saque");
				if ((saldo - saque)>=0) 
					System.out.println("Novo Saldo: R$" + (saldo - saque));
				else 
					System.out.println("Saldo Insuficiente");
			break;
		case 3:
			System.out.println("Qual o valor a ser depositado? ");
			deposito = leia.nextFloat();
			System.out.println("Operação - Depósito" + "\nNovo Saldo: R$" + (saldo + deposito));
			break;
		default:
			System.out.println("Operação Inválida!");
		
		}
		
		
		
		leia.close();
	}

}
