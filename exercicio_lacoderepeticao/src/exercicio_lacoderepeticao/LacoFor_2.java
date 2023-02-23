package exercicio_lacoderepeticao;

import java.util.Scanner;

public class LacoFor_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador;
		int numero;
		
		
		for (contador = 1; contador <=10; contador ++) {
			System.out.println("\nDigite o " + contador + "º número: ");
			numero = leia.nextInt();
			
		
			if(numero % 2 == 0 ) 
			System.out.println("Total de números pares: " + contador);
			
			 
			
		
			else {
			System.out.println("Total de números ímpares: " + contador);
		}
		}
		
		leia.close();
	}

}
