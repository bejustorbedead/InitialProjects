package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Escreva as medidas do Triangulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
		System.out.println("Escreva as medidas do Triangulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
		
		double areaX= x.area();
		double areaY= y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n",areaX);
		System.out.printf("Área do triângulo Y: %.4f%n",areaY);
		
		if (areaX>areaY) {
			System.out.println("O triângulo X possui a maior área.");
		} else if (areaY>areaX) {
			System.out.println("O triângulo Y possui a maior área.");
		} else {
			System.out.println("Ambos os triângulos possuem a mesma área.");
		}
		
		sc.close();
	}

}
