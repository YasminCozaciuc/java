package atividade_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class variavel3 {

	public static void main(String[] args) {
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		
		DecimalFormat df = new DecimalFormat ("###.##");
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite seus descontos: ");
		descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("Seu salário líquido é: R$" + df.format(salarioLiquido));
	}

}
