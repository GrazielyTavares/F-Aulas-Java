package questMatriz2;

import java.util.Random;
import java.util.Scanner;

public class questMatriz2 {

	public static void main(String[] args) {
		Random ab = new Random();
		int cont = 0, som = 0;
		
		int[][] list = new int[5][5];
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0;j<list.length; j++) {
				list[i][j] = ab.nextInt(1001);
				System.out.print(list[i][j] +"\t");
				if(list[i][j] > som) {
					som = list[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("maior = " + som);
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0;j<list.length; j++) {
				if(list[i][j] == som) {
					System.out.println("[" + i + "," + j + "]");
				}
				}
			}
	}
	
	
	
}
