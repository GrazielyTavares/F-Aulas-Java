package correcaoProva;

import java.util.Random;
import java.util.Scanner;

public class check05_Quest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int cidade, origem, destino, parada, total;
		
		System.out.println("Ordem da matriz: ");
		cidade = sc.nextInt();
		
		int[][] tempo = new int[cidade][cidade];
		
		for (int i = 0; i < tempo.length; i++) {
			for (int j = 0; j < tempo.length; j++) {
				tempo[i][j] = rd.nextInt(1, 21);
				tempo[j][i] = tempo[i][j];
			}
			
		}
		
		for (int i = 0; i < tempo.length; i++) {
			for (int j = 0; j < tempo.length; j++) {
				System.out.print(tempo[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Origem: ");
		origem = sc.nextInt();
		System.out.println("Destino: ");
		destino = sc.nextInt();
		System.out.println("tempo" + tempo[origem -1][destino -1]);
		
		System.out.println("Origem: ");
		origem = sc.nextInt();
		System.out.println("Destino: ");
		destino = sc.nextInt();
		System.out.println("Parada: ");
		parada = sc.nextInt();
		System.out.println("tempo" + tempo[origem -1][destino -1]);
		
		total = tempo[origem-1][parada-1] + tempo[parada-1][destino-1];
		
		System.out.println("tempo: " + total);
	}

}
