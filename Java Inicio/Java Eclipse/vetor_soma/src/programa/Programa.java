package programa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar ? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("VALORES: ");
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		System.out.print("SOMA: ");
		int soma = 0;
		for(int i=0;i<vetor.length;i++) {
			soma += vetor[i];
		}
		System.out.print(soma);
		
		System.out.println();
		System.out.print("MÉDIA: ");
		double media = soma / vetor.length;
		System.out.print(media);
		
		sc.close();
	}

}
