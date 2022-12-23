package interface_;

import java.util.Locale;
import java.util.Scanner;

import metods.Metods;

public class Interface {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Metods metod = new Metods();
		
		System.out.print("Name: ");
		metod.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		metod.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		metod.tax = sc.nextDouble();
		
		System.out.println("Employee: " + metod);
		
		System.out.print("Wich percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		metod.increaseSalary(percentage);
		
		System.out.print("Updated Data: " + metod);
		
		sc.close();
	}

}
