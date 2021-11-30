/*
 * Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. 
 * Armazene os N produtos em um vetor. 
 * Em seguida, mostrar o preço médio dos produtos.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum = 0.0;

		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}

		System.out.println();
		System.out.printf("AVERAGE PRICE = %.2f%n", (sum / vect.length));

		sc.close();

	}

}
