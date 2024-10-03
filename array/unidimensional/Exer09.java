import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		// Exercicio 09
		// Escreva um programa em Java que leia e armazene o nome e o salário dos
//		funcionários de uma empresa. Imprima no vídeo o total que a empresa gasta com a
//		folha de pagamento (soma do salário de todos os funcionários) e a média salarial
//		paga aos funcionários.

		Scanner a = new Scanner(System.in);
		int tamanho = a.nextInt(); 
		System.out.println("Nome dos funcionários:");
		String[] nome = new String[tamanho];
		int[] salario = new int[tamanho];
		
		int conta = 0, media;
		
		//armazenar os valores
		for(int i=0; i<salario.length; i++) {
			System.out.println("Salario :");
			salario[i] = a.nextInt();
			conta += salario[i];
		}
		
		//impressão
		System.out.println("Folha de pagamento: " + conta);
		System.out.println("Media salarial: " + conta/tamanho);
	}

}
