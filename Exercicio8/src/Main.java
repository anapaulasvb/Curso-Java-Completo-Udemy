import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um valor inteiro > 0");
		int valor = sc.nextInt();

		if (valor <= 0)
			System.out.println("Invalido");

		else {
			
			System.out.println("Divisores de " + valor);

			for (int i = 1; i <= valor; i++) {
				if (valor % i == 0)
					System.out.println(i);
			}

		}

		sc.close();

	}

}
