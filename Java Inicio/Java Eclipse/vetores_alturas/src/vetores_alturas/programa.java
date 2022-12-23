package vetores_alturas;

import java.util.Locale;
import java.util.Scanner;

import atributos.Metodos;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Quantas pessoas serão digitadas ? ");
		int pessoas = sc.nextInt();
		int[] tamanho = new int[pessoas];
		
		String[] nome = new String[pessoas];
		int[] idade = new int[pessoas];
		double[] altura = new double[pessoas];
		
		for (int i = 0; i < tamanho.length; i++) {
			System.out.println("Dados da pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		System.out.print("Altura média: ");
		double soma_altura = 0;
		for (int i = 0; i < tamanho.length; i++) {
			soma_altura += altura[i];
		}
		double media = soma_altura / tamanho.length;
		System.out.printf("%.2f%n", media);
		
		int porce = 0;
		for (int i = 0; i < tamanho.length; i++) {
			if (idade[i] < 16) {
				porce ++;
			}
		}
		double porcentagem = ((double)porce / pessoas) * 100.0;
		System.out.print("Pessoas com menos de 16 anos: " + porcentagem+"%");
		System.out.println();
		
		for(int i = 0; i<tamanho.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
