package exercicios_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ExArray_list {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String cor;
		int contador;
		
		Collection<String> cores = new ArrayList<String>();
		
		for(contador = 1; contador < 6; contador ++){
			System.out.println("Digite uma cor: ");
			cor = leia.nextLine();
			cores.add(cor);
			
		}
		
		System.out.println("Listando todas as cores:");
		cores.forEach(System.out::println);
		
		((ArrayList<String>) cores).sort(null);
		System.out.println("\nOrdenar as cores:\n" + cores);
	
		
		
			
		
		
		leia.close();
	}

}
