package exercicio_laçocondicional;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int codigo;
	int quantidade;
	
	System.out.println("Cardápio:");
	System.out.println("1 - Cachorro-Quente");
	System.out.println("2 - X-Salada");
	System.out.println("3 - X-Bacon");
	System.out.println("4 - Bauru");
	System.out.println("5 - Refrigerante");
	System.out.println("6 - Suco de laranja");
	
	System.out.println("Digite o código do produto: ");
	codigo = leia.nextInt();
	System.out.println("Digite a quantidade de produtos: ");
	quantidade = leia.nextInt();
	
	switch(codigo) {
	case 1: 
		System.out.println("Produto: Cachorro-quente" +"\nValor total: R$" + (quantidade*10));
		break;
	case 2: 
		System.out.println("Produto: X-Salada" +"\nValor total: R$" + (quantidade*15));
		break;
	case 3: 
		System.out.println("Produto: X-Bacon" +"\nValor total: R$" + (quantidade*18));
		break;
	case 4: 
		System.out.println("Produto: Bauru" +"\nValor total: R$" + (quantidade*12));
		break;
	case 5: 
		System.out.println("Produto: Refrigerante" +"\nValor total: R$" + (quantidade*8));
		break;
	case 6: 
		System.out.println("Produto: Suco de laranja" +"\nValor total: R$" + (quantidade*13));
		break;
	default:
		System.out.println("Produto Inválido!");	
		
	}
	
	leia.close();
	}

}
