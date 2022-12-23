package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> employee = new ArrayList<>();
		System.out.println();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Employee #"+i+" Data: ");
			System.out.print("Outsorcered? (y/n): ");
			char out = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			if (out == 'y') {
				System.out.print("Aditional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.add(emp);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : employee) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
	}

}
