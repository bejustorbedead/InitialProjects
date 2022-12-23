package program;

import java.util.Locale;
import java.util.Scanner;

import equations.Equations;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Equations equation = new Equations();
		
		System.out.println("Enter rectangle width and heigth: ");
		equation.width = sc.nextDouble();
		equation.height = sc.nextDouble();
		
		System.out.println();
		System.out.println(equation);
		
		sc.close();

	}

}
