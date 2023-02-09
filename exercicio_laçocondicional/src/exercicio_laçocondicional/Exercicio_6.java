package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Cargo::");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		
		String nome;
		int codigo;
		float salario;
		
		System.out.println("Digite seu nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		System.out.println("Digite o código do seu cargo: ");
		codigo = leia.nextInt();
		System.out.println("Digite seu salário:");
		salario = leia.nextFloat();
		
		switch(codigo) {
		case 1:
			System.out.println("Nome: " + nome + "\nCargo: Gerente \nSalário: R$" + (salario +(salario*0.10)));
			break;
		case 2:
			System.out.println("Nome: " + nome + "\nCargo: Vendedor \nSalário: R$" + (salario +(salario*0.07)));
			break;
		case 3:
			System.out.println("Nome: " + nome + "\nCargo: Supervisor \nSalário: R$" + (salario +(salario*0.09)));
			break;
		case 4:
			System.out.println("Nome: " + nome + "\nCargo: Motorista \nSalário: R$" + (salario +(salario*0.06)));
			break;
		case 5:
			System.out.println("Nome: " + nome + "\nCargo: Estoquista \nSalário: R$" + (salario +(salario*0.05)));
			break;
		case 6:
			System.out.println("Nome: " + nome + "\nCargo: Técnico de TI \nSalário: R$" + (salario +(salario*0.08)));
			break;
		default:
			System.out.println("Produto Inválido!");
		}
		
		leia.close();
	}

}
