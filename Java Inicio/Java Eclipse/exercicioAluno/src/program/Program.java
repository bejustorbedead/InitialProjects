package program;

import java.util.Locale;
import java.util.Scanner;

import students.Grade;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Grade grade = new Grade();
		
		System.out.print("Student: ");
		grade.student = sc.nextLine();
		System.out.print("Grade 1: ");
		grade.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		grade.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		grade.grade3 = sc.nextDouble();
		
		System.out.println(grade.finalGrade());
		System.out.println(grade.pass());
		
		sc.close();
	}

}
