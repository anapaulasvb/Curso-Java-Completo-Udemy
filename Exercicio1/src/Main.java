import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String product1, product2;
		int age, code;
		char gender;
		double price1, price2, measure;

		System.out.print("1st Product = ");
		product1 = sc.nextLine();

		System.out.print("2nd Product = ");
		product2 = sc.nextLine();

		System.out.print("Age = ");
		age = sc.nextInt();

		if (age < 0)
			System.out.println("Error");

		else {
			System.out.print("Code = ");
			code = sc.nextInt();

			if (code < 0)
				System.out.println("Error");

			else {
				System.out.print("Gender (M/F) = ");
				gender = sc.next().charAt(0);

				if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
					System.out.print(product1 + " price = ");
					price1 = sc.nextDouble();

					if (price1 < 0)
						System.out.println("Error");

					else {
						System.out.print(product2 + " price = ");
						price2 = sc.nextDouble();

						if (price2 < 0)
							System.out.println("Error");

						else {
							System.out.print("Measure = ");
							measure = sc.nextDouble();

							if (measure < 0)
								System.out.println("Error");

							else {
								System.out.println();
								System.out.println("Products:");
								System.out.printf("%s which price is %.2f%n", product1, price1);
								System.out.printf("%s which price is %.2f%n", product2, price2);
								System.out.println();
								System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
								System.out.println();
								System.out.printf("Measue with eight decimal places: %.8f%n", measure);
								System.out.printf("Rouded (three decimal places): %.3f%n", measure);
							}
						}
					}
				}

				else
					System.out.println("Erro");

			}
		}

		sc.close();

	}

}
