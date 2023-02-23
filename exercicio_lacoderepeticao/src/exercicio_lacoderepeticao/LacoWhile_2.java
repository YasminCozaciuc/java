package exercicio_lacoderepeticao;

import java.util.Scanner;

public class LacoWhile_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, categoria;
		String continua = "s";
		
		while (!continua.equals("n")) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite seu sexo: \n1- Masculino\n2-Feminino\n3-Outros");
			sexo = leia.nextInt();
			
			System.out.println("Digite a categoria: \n1-Backend\n2-Frontend\n3-Mobile\n4-Fullstack");
			categoria = leia.nextInt();
			
			System.out.println("\nDeseja continuar?");
			System.out.println("\nDigite s para sim OU digite n para não: ");
            continua = leia.next();
			
            
            if(categoria == 2) 
            	System.out.println("Total de pessoas desenvolvedoras beckend: " + );
            	if (sexo == 2 && categoria == 2 )
            		System.out.println("Total de mulheres desenvolvedoras Frontend: " + );
            	if (sexo == 1 && categoria == 3 && idade >=40)
            		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + );
            	if (sexo == 2 && categoria == 4 && idade <= 30)
            		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + );
           
           
		}
		leia.close();
	}

}
