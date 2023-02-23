package exercicio_lacoderepeticao;

import java.util.Scanner;

public class LacoFor_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		int contador;

		
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: \n!Atenção: este deve ser MAIOR que o primeiro número! ");
		n2 = leia.nextInt();
		
			
		if (n1<n2) { 
				System.out.println("No intervalo entre " + n1 + " e " + n2 + ": \n");
				
		for(contador = n1; contador <= n2; contador ++) {
			if(contador/3 == 0 && contador/5 == 0) 
					System.out.println(contador + " é multiplo de 3 e 5");
				
		}	
		}	
			else {
			System.out.println("Intervalo Inválido!");
		}
		

			
		leia.close();
	}
}