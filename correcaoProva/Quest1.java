package correcaoProva;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class check05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int ordem;
		
		System.out.println("ordem da matriz");
		
		ordem = sc.nextInt();
		
		int [][] matriz = new int[ordem][ordem];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = rd.nextInt(5);
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
