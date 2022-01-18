/*
 * Uma empresa possui funcionários próprios e terceirizados.
 * Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora. 
 * Funcionários terceirizado possuem ainda uma despesa adicional.
 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas. 
 * Funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
 * Fazer um programa para ler os dados de N funcionários e armazená-los em uma lista. 
 * Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= n; i++) {

			System.out.println("Employee #" + i + " data:");

			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}

			else {
				list.add(new Employee(name, hours, valuePerHour));
			}

			System.out.println();

		}

		System.out.println("PAYMENTS:");
		for (Employee employee : list) {
			System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
		}

		sc.close();

	}

}