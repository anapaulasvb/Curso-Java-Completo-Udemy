import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os valores das coordenadas X e Y:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0)
				System.out.println("Primeiro Quadrante");
			else if (x < 0 && y > 0)
				System.out.println("Segundo Quadrante");
			else if (x < 0 && y < 0)
				System.out.println("Terceiro Quadrante");
			else
				System.out.println("Quarto Quadrante");

			System.out.println();
			System.out.println("Entre com os valores das coordenadas X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();

	}

}
