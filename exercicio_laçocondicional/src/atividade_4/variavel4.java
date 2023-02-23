package atividade_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class variavel4 {

	public static void main(String[] args) {
		
	DecimalFormat df = new DecimalFormat ("###.##");
	Scanner leia = new Scanner (System.in);
	
	float numero1;
	float numero2;
	float numero3;
	float numero4;

	System.out.println("Digite o primeiro número: ");
	numero1 = leia.nextFloat();
	
	System.out.println("Digite o segundo número: ");
	numero2 = leia.nextFloat();
	
	System.out.println("Digite o terceiro número: ");
	numero3 = leia.nextFloat();
	
	System.out.println("Digite o quarto número: ");
	numero4 = leia.nextFloat();
	
	float calculo = (numero1*numero2) - (numero3*numero4);
	
	System.out.println("A diferença de produtos é: " + df.format(calculo));
	
	
	}

}
