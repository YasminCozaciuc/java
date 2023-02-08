package atividade_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class variavel {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario+abono;
		
		System.out.println("Seu novo salario é: R$" + df.format(novoSalario));
		
		

	}

}
