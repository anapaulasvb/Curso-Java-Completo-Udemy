// Treino com Arrays e Listas

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Purchase;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Purchase> list = new ArrayList<>();

		System.out.println("Product List:");
		System.out.println();
		System.out.println("ID     Product     Unit Price");
		System.out.println("1001   TV          $1000.00");
		System.out.println("1002   Computer    $2000.00");
		System.out.println("1003   Mouse       $50.00");
		System.out.println("1004   Desk        $200.00");
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Enter 0 to exit");
		System.out.println();
		System.out.print("Product ID: ");
		int id = sc.nextInt();

		while (id != 0) {

			if (id == 1001 || id == 1002 || id == 1003 || id == 1004) {
				System.out.print("Quantity: ");
				int quantity = sc.nextInt();
				System.out.println();

				list.add(new Purchase(id, quantity));
			}

			else {
				System.out.println("Invalid ID");
			}

			System.out.print("Product ID: ");
			id = sc.nextInt();

		}

		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("PURCHASE:");
		System.out.println();
		for (Purchase obj : list) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("Enter 1 to remove an item");
		System.out.println("Enter any other key to complete purchase");
		int option = sc.nextInt();
		System.out.println();

		if (option == 1) {
			System.out.println("Which ID item do you want to remove? ");
			int idAux = sc.nextInt();
			list.removeIf(x -> x.getId() == idAux);
			System.out.println();
			System.out.println("UPDATED PURCHASE:");
			for (Purchase obj : list) {
				System.out.println(obj);
			}
			System.out.println();

		}

		double totalToPay = 0.0;
		for (Purchase obj : list) {
			totalToPay += obj.price();
		}

		System.out.printf("Purchase completed. Total to pay: $%.2f", totalToPay);

		sc.close();

	}

}
