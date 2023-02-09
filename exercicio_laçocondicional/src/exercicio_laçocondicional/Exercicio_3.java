package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeira;
		
		
		
		System.out.println("Escreva seu nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		System.out.println("Escreva sua idade: ");
		idade = leia.nextInt();
		System.out.println("É sua primeira doação de sangue? \nDigite true para sim, e false para não: ");
		leia.skip("\\R?");
		primeira = leia.nextBoolean();
		
		if (idade >= 60 && idade <= 69) {
			if(primeira)
				System.out.println(nome + " não está apto para doar.");
			else
				System.out.println(nome +" está apto para doar.");
		}else if (idade < 18 || idade > 69) 
			System.out.println(nome +" não está apto para doar.");
		else 
			System.out.println(nome +" está apto para doar.");
		
		
		leia.close();
	}

}
