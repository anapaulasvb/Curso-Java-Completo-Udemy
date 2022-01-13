/*
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). 
 * Depois, mostrar um sumário do pedido conforme exemplo da apostila. 
 * Nota: o instante do pedido deve ser o instante do sistema: new Date()
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		sc.next();
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		Date moment = new Date();

		Client client = new Client(name, email, birthDate);
		
		Order order = new Order(moment, OrderStatus.valueOf(status), client);

		for (int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(productName, price);

			OrderItem item = new OrderItem(quantity, price, product);

			order.addItem(item);

		}
		
		System.out.println();
		System.out.println(order);

		sc.close();

	}

}
