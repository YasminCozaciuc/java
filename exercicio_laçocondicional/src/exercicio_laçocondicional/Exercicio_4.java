package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	String entrada1, entrada2, entrada3;
	
	System.out.println("Escolha entre Vertebrado ou Invertebrado: ");
	leia.skip("\\R?");
	entrada1 = leia.nextLine();
	System.out.println("Escolha entre Ave, Mamífero, Inseto ou Anelídeo: ");
	leia.skip("\\R?");
	entrada2 = leia.nextLine();
	System.out.println("Escolha entre Carnívoro, Onívoro, Herbívoro ou Hematófago: ");
	leia.skip("\\R?");
	entrada3 = leia.nextLine();
	
	if (entrada1.equals("vertebrado")) {
		if(entrada2.equals("ave")) {
			if(entrada3.equals("carnivoro"))
				System.out.println("águia");
			else
				System.out.println("pomba");
		}else {
			if(entrada3.equals("onivoro"))
				System.out.println("homem");
			else
				System.out.println("vaca");
			
		}
	}else {
		if(entrada2.equals("inseto")) {
			if(entrada3.equals("hematofago"))
				System.out.println("pulga");
			else
				System.out.println("lagarta");
		}else {
			if(entrada3.equals("hematofago"))
				System.out.println("sanguessuga");
			else
				System.out.println("minhoca");
			}
		}
	
	leia.close();
	}
	
	}

