/*
 * Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato .csv.
 * Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.
 * Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
 * 
 * Input file:
 * Maria,maria@gmail.com,3200.00
 * Alex,alex@gmail.com,1900.00
 * Marco,marco@gmail.com,1700.00
 * Bob,bob@gmail.com,3500.00
 * Anna,anna@gmail.com,2800.00
 * 
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine(); // /home/anapaula/Documents/in.csv
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] split = line.split(",");
				list.add(new Employee(split[0], split[1], Double.parseDouble(split[2])));
				line = br.readLine();
			}
			
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(x -> x.getSalary() > 2000.00)
					.map(x -> x.getEmail())
					.sorted(comparator)
					.collect(Collectors.toList());
						
			System.out.println("Email of people whose salary is more than 2000.00:");
			names.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary()).reduce(0.0, (x,y) -> x+y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));
			
		}
		
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
