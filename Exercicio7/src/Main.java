import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fatorial = 1;

		System.out.println("Entre com um valor inteiro positivo");
		int valor = sc.nextInt();

		if (valor < 0)
			System.out.println("Valor invalido");

		else {

			if (valor == 0)
				fatorial = 1;

			else {
				for (int i = valor; i > 0; i--)
					fatorial = fatorial * i;
			}

			System.out.print("Fatorial = " + fatorial);
		}

		sc.close();

	}

}
