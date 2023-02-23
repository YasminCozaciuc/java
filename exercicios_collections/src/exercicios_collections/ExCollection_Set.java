package exercicios_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExCollection_Set {


	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		Double n;
		
		Set<Double> setNumero = new HashSet<Double>();
		
		setNumero.add(2.0);
		setNumero.add(5.0);
		setNumero.add(1.0);
		setNumero.add(3.0);
		setNumero.add(4.0);
		setNumero.add(9.0);
		setNumero.add(7.0);
		setNumero.add(8.0);
		setNumero.add(10.0);
		setNumero.add(6.0);
		
		System.out.println("Digite o número que você quer encontrar: ");
		n = leia.nextDouble();
		
		if(setNumero.contains(n)) 
			System.out.println("O número " + n + " foi encontrado!");
		
		else {
			System.out.println("O número " + n + " não foi encontrado!");
		}
		
	}

}
