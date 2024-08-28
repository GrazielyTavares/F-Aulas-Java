import java.util.Random;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		//exerc 10
		
		//Escrever um programa em Java que preencha um vetor de 10 posições com valores aleatórios.
		//Em seguida, colocar os valores do vetor em ordem crescente. Imprima no vídeo os elementos do vetor antes e após a ordenação.

		Random rd = new Random();
		
		System.out.println("Tamanho da lista:");
		int c;
		int[] a = new int[rd.nextInt(5)];
		
		//armazenar os valores
		for(int i=0; i<a.length; i++) {
			System.out.println("Valor da lista:");
			a[i] = rd.nextInt(15);
			System.out.println(a[i] + " ");
		}
		
		//ordenação
		for(int j =0; j<a.length; j++) {
			for(int i = 0; i<a.length - 1; i++) {
				if(a[i] > a[i+1]) {
					c = a[i];
					a[i] = a[i+1];
					a[i+1] = c;
				}
			}
		}
		
		//impressão
		System.out.println("ordem: ");
		for(int j : a) {
			System.out.println(j);
			
		}
	}

}
