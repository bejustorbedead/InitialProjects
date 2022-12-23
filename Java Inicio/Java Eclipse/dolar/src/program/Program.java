package program;

import java.util.Locale;
import java.util.Scanner;

import converter.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conv = new CurrencyConverter();
		
		System.out.print("What is the dolar price ? ");
		conv.dolar = sc.nextDouble();
		
		System.out.print("How many dolars do you wanna buy ? ");
		conv.quant = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f%n", conv.conversor());
		
		sc.close();
	}

}
