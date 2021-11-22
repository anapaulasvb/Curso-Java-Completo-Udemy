// Exercício de introdução à Orientação a Objetos com Método dentro da classe Triangulo

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();

	}

}

/*
 * Benefícios de calcular a área do triângulo por meio de um MÉTODO dentro da
 * CLASSE Triangle: 
 * 1) Reaproveitamento de código: eliminação de código repetido
 * 2) Delegação de responsabilidades: quem deve ser responsável por saber como
 * calcular a área de um triângulo é o próprio triângulo.
 */
