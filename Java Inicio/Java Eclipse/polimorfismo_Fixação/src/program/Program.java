package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
			System.out.print("Enter the number of products: ");
			int n = sc.nextInt();
			List<Product> list = new ArrayList<>();
			
			for (int i = 1; i <= n; i++) {
				System.out.println("Product #"+i+" Data: ");
				System.out.print("Common, Used or Imported (c/u/i) ?: ");
				char answer = sc.next().charAt(0);
				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				if (answer == 'i') {
					System.out.print("Customs Fee: ");
					Double customsFee = sc.nextDouble();
					Product prod = new ImportedProduct(name, price, customsFee);
					list.add(prod);
				} else if (answer == 'u') {
					System.out.print("Manufacture Date (DD/MM/YYYY): ");
					sc.nextLine();
					String date = sc.nextLine();
					Product prod = new UsedProduct(name, price, date);
					list.add(prod);
				} else {
					Product prod = new Product(name, price);
					list.add(prod);
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Price Tags: ");
			for (Product prod : list) {
				System.out.println(prod.priceTag());
			}
		
		sc.close();
	}

}
