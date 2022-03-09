/*
 * Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários, dentre outras coisas. 
 * Um dos cálculos que ela precisa é encontrar o maior dentre um conjunto de elementos. 
 * Fazer um programa que leia um conjunto de produtos a partir de um arquivo e depois mostre o mais caro deles.
 * 
 * Conteúdo do arquivo:
 * Computer,890.50
 * IPhone X,910.00
 * Tablet,550.00
 * 
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String file = "/home/anapaula/Documents/in.txt";
		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line = br.readLine();

			while (line != null) {
				String[] split = line.split(",");
				list.add(new Product(split[0], Double.parseDouble(split[1])));
				line = br.readLine();
			}

			System.out.println("Most expensive:");
			System.out.println(CalculationService.max(list));

		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
