package program;

import java.util.Locale;
import java.util.Scanner;

import info.Info;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Info info;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there any initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial_deposit = sc.nextDouble();
			info = new Info(number, holder, initial_deposit);
		} else {
			info = new Info(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(info);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		info.depositValue(depositValue);
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(info);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		info.withDrawValue(withdrawValue);
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(info);
		
		sc.close();
	}

}
