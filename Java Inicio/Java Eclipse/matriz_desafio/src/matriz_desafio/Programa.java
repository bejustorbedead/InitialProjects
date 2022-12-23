package matriz_desafio;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] vetor = new int[m][n];
		
		for (int i = 0; i<vetor.length; i++) {
			for (int j = 0; j<vetor[i].length; j++) {
				vetor[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Fale o número que quer achar: ");
		int x = sc.nextInt();
		
		for (int i = 0; i<vetor.length; i++) {
			for (int j = 0; j<vetor[i].length; j++) {
				if (vetor[i][j] == x) {
					System.out.println("Posição de linha: "+i+", Coluna: "+j);
					if (j > 0) {
						System.out.println("Left: "+ vetor[i][j-1]);
					}
					if (i>0) {
						System.out.println("Up: " + vetor [i-1][j]);
					}
					if (j < vetor[i].length-1) {
						System.out.println("Right: "+ vetor[i][j+1]);
					}
					if (i < vetor.length-1) {
						System.out.println("down: " + vetor [+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
