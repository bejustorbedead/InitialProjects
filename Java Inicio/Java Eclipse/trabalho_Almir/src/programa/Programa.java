package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Entidades;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Entidades> lista = new ArrayList<>();
		
		System.out.print("Quantas vendas você vai querer para o 1° lote ? ");
		int lote = sc.nextInt();
		
		for (int i = 1; i <= lote; i++) {
			System.out.print("Qual festa vai querer ir ? (1-3) ");
			int festa = sc.nextInt();
			System.out.print("Valor do ingresso: ");
			double valor = sc.nextDouble();
			lista.add(new Entidades(1,"30/11/2022",valor,festa));
		}
		
		System.out.print("Quantas vendas você vai querer para o 2° lote ? ");
		lote = sc.nextInt();
		
		for (int i = 1; i <= lote; i++) {
			System.out.print("Qual festa vai querer ir ? (1-3) ");
			int festa = sc.nextInt();
			System.out.print("Valor do ingresso: ");
			double valor = sc.nextDouble();
			lista.add(new Entidades(2,"30/11/2022",valor,festa));
		}
		
		for (Entidades entidade : lista) {
			System.out.println(entidade.toString());
		}
		
		sc.close();

	}

}
