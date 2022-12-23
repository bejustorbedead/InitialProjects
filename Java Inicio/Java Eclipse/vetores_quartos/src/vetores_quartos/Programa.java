package vetores_quartos;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			Rent[] vetor= new Rent[10];
		
			System.out.print("Quantos quartos você vai alugar ? ");
			int n = sc.nextInt();
			
			for (int i = 1; i<=n;i++) {
				System.out.println();
				System.out.println("Aluguei #"+i+": ");
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Quarto: ");
				int quarto = sc.nextInt();
				
				vetor[quarto] = new Rent (name,email);
			}
			
			System.out.println();
			System.out.println("Quartos ocupados: ");
			for (int i=0; i < 10; i++) {
				if (vetor[i] != null) {
					System.out.println(i + ": " +vetor[i]);
				}
			}
			
		
		sc.close();
	}

}
