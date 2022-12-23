package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enumm.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int number = sc.nextInt();
		List<Shape> list = new ArrayList<>();
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println("Shape #"+i+" Data: ");
			System.out.print("Rectangle or Circle (r/c) ? ");
			char answer = sc.next().charAt(0);
			
			System.out.print("Color(BLUE/RED/BLACK): ");
			Color color = Color.valueOf(sc.next());
			
			if (answer == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} 
			
			else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			System.out.println();
		}
		
		System.out.println("Shape Areas: ");
		for (Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}
		sc.close();
	}
}
