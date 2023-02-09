package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("###.####");
		
		double n1, n2;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();
		
		System.out.println("O número " + n1 + " somado ao número " + n2	+ " é igual a " + (n1 + n2));
		System.out.println("O número " + n1 + " subritaído ao número " + n2	+ " é igual a " + (n1 - n2));
		System.out.println("O número " + n1 + " multiplicado ao número " + n2	+ " é igual a " + (n1 * n2));
		
		if (n2!=0)
		System.out.println("O número " + n1 + " dividido ao número " + n2	+ " é igual a " + (n1 / n2));
		//se o número for 0 ele vai ignorar a sentença.
		else
			System.out.println("Não é possível dividir um número por zero!");
		
		System.out.println("O número " + n1 + " elevado ao número " + n2	+ " é igual a " + Math.pow(n1, n2));
		
		if(n1>0)
		System.out.println("A raiz de " + n1 + " é igual a " + df.format(Math.sqrt(n1)));
		else 
			System.out.println("Não existe raiz quadrada de número negativo.");
		
		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++ n1);
		
		
		System.out.println("Pós Incremento");
		//System.out.println(n2)- usado normalmente em laço de repetição 
		System.out.println(n2 ++);
		System.out.println(n2);
		
		System.out.println("Operação de atribuição: ");
		System.out.println(n1 = n1 + n2);
		System.out.println(n1 += n2);
		
		leia.close();
		
	}

}
