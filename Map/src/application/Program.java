/*
 * Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. 
 * Você deve fazer um programa para ler os registros de votação a partir de um arquivo, e daí gerar um relatório consolidado com os totais de cada candidato.
 * 
 * Input file example:
 * Alex Blue,15
 * Maria Green,22
 * Bob Brown,21
 * Alex Blue,30
 * Bob Brown,15
 * Maria Green,27
 * Maria Green,22
 * Bob Brown,25
 * Alex Blue,31
 * 
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> result = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine(); // /home/anapaula/Documents/in.csv

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] split = line.split(",");
				String candidate = split[0];
				Integer numberOfVotes = Integer.parseInt(split[1]);

				if (!result.containsKey(candidate)) {
					result.put(candidate, numberOfVotes);
				}

				else {
					Integer total = result.get(candidate) + numberOfVotes;
					result.put(candidate, total);
				}

				line = br.readLine();
			}

			for (String key : result.keySet()) {
				System.out.println(key + ": " + result.get(key));
			}

		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
