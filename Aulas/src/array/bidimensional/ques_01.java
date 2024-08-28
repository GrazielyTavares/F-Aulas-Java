package matrix;

import java.util.Scanner;

public class ques_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [][] x = new int[2][2];
		int soma = 0;
		
		//entrada de dados
		for(int i=0; i<x.length;i++) {
			for(int j=0; j<x.length;j++) {
				System.out.println("Valor: ");
				x[i][j] = sc.nextInt();
			}
		}
		
		//formato tabela
		//  \t -> passa para a próxima coluna

		System.out.println();
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j< x.length; j++) {
				if(x[i] == x[j]) {
					soma += x[i][j]; 
				}
				System.out.print(x[i][j] + "\t");
			}
			
			}
		   
			System.out.println();
			System.out.print(soma);
		}
	}


