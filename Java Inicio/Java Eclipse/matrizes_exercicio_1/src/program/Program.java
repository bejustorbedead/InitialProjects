package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
				int n = sc.nextInt();
				int[][] matriz = new int[n][n];
				
				for (int i = 0; i<n; i++) {
					for (int j = 0; j<n; j++) {
						matriz[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Matriz: ");
				System.out.println();
				
				for (int i = 0; i<n; i++) {
					for (int j = 0; j<n; j++) {
						System.out.print(matriz[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println("Diagonal Principal: ");
				
				for (int i = 0; i<n; i++) {
					System.out.print(matriz[i][i] + " ");
				}
				
				System.out.println("");
				System.out.println("");
				System.out.print("Quantidades de números negativos: ");
				int nega = 0;
				for (int i = 0; i<n; i++) {
					for (int j = 0; j<n; j++) {
						if (matriz[i][j] <0) {
							nega++;
						}
					}
				}
				
				if (nega <= 0) {
					System.out.print("Não existem numeros negativos.");
				} else {
					System.out.println(nega);
				}
				
			sc.close();

	}

}
