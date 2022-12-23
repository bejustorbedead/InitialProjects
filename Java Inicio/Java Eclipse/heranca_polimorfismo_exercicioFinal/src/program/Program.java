package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<TaxPayer> tax = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or Company(i/c) ?: ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual Income: ");
			Double anualCome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				tax.add(new Individual(name, anualCome, healthExpenditures));
			} else {
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				
				tax.add(new Company(name, anualCome, numberOfEmployees));
			}
			System.out.println();
		}
		
		double totalTax = 0;
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxpayer : tax) {
			System.out.printf(taxpayer.getName() + ": $ %.2f%n", taxpayer.tax());
			totalTax += taxpayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", totalTax);
		
		sc.close();

	}

}
