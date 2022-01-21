/*
 *Fazer um programa para ler os dados de N contribuintes, os quais podem ser pessoa física ou pessoa jurídica, 
 *e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
 *Os dados de pessoa física são: nome, renda anual e gastos com saúde. 
 *Os dados de pessoa jurídica são nome, renda anual e número de funcionários. 
 *As regras para cálculo de imposto são as seguintes:
 *Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. 
 *Pessoas com renda de 20000.00 em diante pagam 25% de imposto. 
 *Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
 *Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. 
 *Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char x = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (x == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}

			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

			System.out.println();

		}

		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer);
			sum += taxPayer.tax();
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

		sc.close();

	}

}
