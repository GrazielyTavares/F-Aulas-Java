package metod;

import java.util.Iterator;
import java.util.Random;

public class exerc5 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		Teste(vetor);
		imprimir(vetor);
		inverter(vetor);
		imprimir(vetor);
	}
	
	public static void Teste(int[] vet) {
		
		Random rd = new Random();
		
		for(int i =0; i < vet.length; i++) {
			vet[i] = rd.nextInt(1, 15);
		}
	}
	
	public static void imprimir(int[] vet) {
		for(int i : vet) {
			System.out.print(i + " ");
		}
	}
	
	public static void inverter(int[] vet) {
		int c;
		for(int i = 0; i < vet.length/2; i++) {			
			c = vet[i];
			vet[i] = vet[vet.length -1 - i];
			vet[vet.length -1 - i] = c;
			
		}
	}
  }

