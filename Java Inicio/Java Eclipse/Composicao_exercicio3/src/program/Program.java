package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import orderStatus.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		Client client = new Client(name, email);
		
		System.out.println();
		System.out.println("Enter Order Data: ");
		System.out.print("STATUS: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(status, client);
		
		System.out.print("How many items to this order?: ");
		int number = sc.nextInt();
		
		for (int aa = 1; aa <= number; aa++) {
			System.out.println("Enter #"+aa+" item Data: ");
			System.out.print("Product Name: ");
			sc.nextLine();
			String pname = sc.nextLine();
			System.out.print("Product Price: ");
			Double price = sc.nextDouble();
			
			Product product = new Product(pname, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order.addItems(orderItem);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		
		sc.close();

	}

}
