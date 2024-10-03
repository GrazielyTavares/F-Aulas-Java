package metod;

import java.util.Random;

public class exerx6 {

	public static void main(String[] args) {
		
		int[][] vetor = new int[4][4];
		Entradas(vetor);
		imprimir(vetor);
		Crescente(vetor);
		imprimir(vetor);
		
	}
	
	public static void Entradas(int[][] vet) {
		
		Random rd = new Random();
		
		for(int i=0; i<vet.length;i++) {
			for(int j=0; j<vet.length;j++) {
				vet[i][j] = rd.nextInt(1, 20);
			}
		}
	}
	
	public static void imprimir(int[][] vet) {
		for(int i = 0; i<vet.length; i++) {
			for(int j = 0; j< vet.length; j++) {
			System.out.print(vet[i][j] + "\t");
		}
			System.out.println();
	}
	}
	
	public static void Crescente(int[][] vet) {
		int c;
		for(int j =0; j<vet.length; j++) {
			for(int i = 0; i<vet.length; i++) {
				if(vet[i][j] > vet[i+1][j+1]) {
					c = vet[i][j];
					vet[i][j] = vet[i+1][j+1];
					vet[i+1][j+1] = c;
				}
			}
		}
	}

}
