package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int nA, nB, nC;
		
		System.out.println("Digite o número A: ");
		nA = leia.nextInt();
		System.out.println("Digite o número B: ");
		nB = leia.nextInt();
		System.out.println("Digite o número C: ");
		nC = leia.nextInt();
		
		if (nA + nB > nC)
			System.out.println("A soma de A + B é maior que C");
		else if (nA + nB < nC)
			System.out.println("A soma de A + B é menor que C");
		else if (nA + nB == nC)
			System.out.println("A soma de A + B é igual a C");
		
		
		leia.close();
		
	}

}
