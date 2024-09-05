package exemple;

import java.util.Random;
import java.util.Scanner;

public class QuestMatriz5 {

	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		Random ac = new Random();

		int cont;
		
		System.out.println("categoria:");
		String[] linha = {"eletronicos", "roupas", "alimentos"};
		System.out.println("Meses : ");
		String[] coluna = {"Jan", "Fev", "Mar"};
		
		int[][] list = new int[linha.length][coluna.length];

		for(int i = 0; i < list.length; i++) {
			for(int j = 0;j< list[i].length; j++) {
				
				list[i][j] = ac.nextInt(1000);
				System.out.print(list[i][j] +"\t"); 
			}
			System.out.println();
		}

		for(int i=0; i <linha.length; i++) {
			cont = 0;
			for(int j = 0; j<linha[i].length(); j++) {
				cont += list[i][j];
			}
			System.out.print("categoria: " + list[i]);
			System.out.println("total = "+ cont);
		}
	}
}
