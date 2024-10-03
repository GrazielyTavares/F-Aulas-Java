package questMatriz2;

import java.text.DecimalFormat;
import java.util.Random;

public class questMatriz3 {

	public static void main(String[] args) {
		
		Random ab = new Random();
		DecimalFormat mascara = new DecimalFormat("#,##0.00");
		double media = 0;
		
		double[][] list = new double[5][5];
		double[] mediaAnual = new double[list.length];
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0;j<list[i].length; j++) {
				list[i][j] = ab.nextDouble(5,36);
				System.out.print(mascara.format(list[i][j]) +"\t");
				media += list[i][j]; 
			}
			mediaAnual[i] = media/list[i].length;
			System.out.println();
		}
		System.out.println();
		for(double x:mediaAnual) {
			System.out.println(x);
		}
	}
}