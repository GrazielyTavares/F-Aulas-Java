//Exercicio
//1. Duas palavras são um “par inverso” se uma for o contrário da outra. Escreva um
//programa em Java que leia um conjunto de palavras e em seguida encontre todos os
//pares inversos na lista de palavras.

package classes;
import java.util.Scanner;

public class exer_1 {
	private static char[] resul;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] list = new String[5];
		
		LerPalavra(list);
		LocalizarPar(list);
	}
		
	private static void LocalizarPar(String[] list) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(" ---> ");
			list[i] = sc.next();
		}
	}

	private static void LerPalavra(String[] list) {
			String letrasInvertidas;
		
		for(String partes : list) {
			letrasInvertidas = Inverter(partes);
		}	
	}
	
	public static String Inverter(String list) {
		char[] letra = new char[list.length()];
		
		for(int i = list.length() - 1; i>=0; i--) {
		
			letra[list.length() - 1 - i] = list.charAt(i);
		}
		
		
		return list;
		
	}
}



