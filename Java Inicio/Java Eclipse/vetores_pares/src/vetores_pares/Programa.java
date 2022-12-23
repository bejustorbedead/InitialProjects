package vetores_pares;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar ? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int quant = 0;
		System.out.print("NÚMEROS PARES: ");
		for (int i = 0; i<vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i]+" ");
				quant++;
			}
		}
		
		System.out.println();
		System.out.print("QUANTIDADE DE PARES: " + quant);
		
		sc.close();
	}

}
