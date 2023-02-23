package exercicio_arrays;

import java.util.Scanner;

public class ExMatriz_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println("Elementos da diagonal princial: ");
		
		for (int indiceLinha = 0; indiceLinha < 1; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 1; indiceColuna++) {
                System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
            }
		}
		for (int indiceLinha = 1; indiceLinha < 2; indiceLinha++) {
            for (int indiceColuna = 1; indiceColuna < 2; indiceColuna++) {
                System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
            }
		}
		for (int indiceLinha = 2; indiceLinha < 3; indiceLinha++) {
            for (int indiceColuna = 2; indiceColuna < 3; indiceColuna++) {
                System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
            }
		}
		
System.out.println("\nElementos da diagonal secundária: ");
		
		for (int indiceLinha = 0; indiceLinha < 1; indiceLinha++) {
            for (int indiceColuna = 2; indiceColuna < 3; indiceColuna++) {
                System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
            }
		}
		for (int indiceLinha = 1; indiceLinha < 2; indiceLinha++) {
            for (int indiceColuna = 1; indiceColuna < 2; indiceColuna++) {
                System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
            }
		}
		for (int indiceLinha = 2; indiceLinha < 3; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 1; indiceColuna++) {
                System.out.println("O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " + matrizInteiros[indiceLinha][indiceColuna]);
            }
		}
		
		
		
		leia.close();
	
		}
}
