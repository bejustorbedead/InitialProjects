package vetores_maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar ? ");
		int n, maiorValor = 0;
		int posicaoValor = 0;
		n = sc.nextInt();
		int[] vetor = new int[n];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicaoValor = i;
			}
		}
		
		System.out.println("Maior valor: "+maiorValor);
		System.out.println("Posição de maior valor: "+posicaoValor);
		
		sc.close();
	}

}
