package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Grades;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Grades grades = new Grades();		
		System.out.print("Digite a Primeira nota: ");
		grades.nota1 = sc.nextDouble();
		System.out.print("Digite a Segunda nota: ");
		grades.nota2 = sc.nextDouble();
		System.out.print("Digite a Terceira nota: ");
		grades.nota3 = sc.nextDouble();
		System.out.print("Digite a Quarta nota: ");
		grades.nota4 = sc.nextDouble();
		
		System.out.printf("A média das notas é: %.2f%n", grades.mediaNotas());
		
		
		sc.close();
	}
}
