/*
 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. 
 * Cada item possui um nome, preço unitário e quantidade, separados por vírgula. 
 * Você deve gerar um novo arquivo chamado "summary.csv", 
 * localizado em uma subpasta chamada "out" a partir da pasta original do arquivo de origem, 
 * contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado pela quantidade),
 */

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> product = new ArrayList<>();

		System.out.println("Enter file path");
		String sourcePath = sc.nextLine();

		File sourceFile = new File(sourcePath);
		String sourceFolder = sourceFile.getParent();

		new File(sourceFolder + "/out").mkdir();

		String targetFile = sourceFolder + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {

			String line = br.readLine();

			while (line != null) {

				String[] split = line.split(",");
				product.add(new Product(split[0], Double.parseDouble(split[1]), Integer.parseInt(split[2])));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
				for (Product item : product) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFile + " CREATED");
			}

			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
