/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. 
 *Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 *Para isso, o programa deve ler um id e o valor X. 
 *Ao final, mostrar a listagem atualizada dos funcionários.
 *Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println();

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (employee == null) {
			System.out.println("This id does not exist!");
		}

		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employee x : list) {
			System.out.println(x);
		}

		sc.close();

	}

	private static boolean hasId(List<Employee> list, int id) {

		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		return employee != null;
	}

}
