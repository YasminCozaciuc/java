package exercicio_arrays;

import java.util.Scanner;

public class ExVetores_1 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int i = 0; i < vetorInteiros.length; i++) {
			
			if(vetorInteiros[i] == numero) {
				System.out.println("O índice do número digitado é " + i);
			}
			else if (i == vetorInteiros.length-1) {
				System.out.println("Número não encontrado");
			}
		}
		
		
	}

}
