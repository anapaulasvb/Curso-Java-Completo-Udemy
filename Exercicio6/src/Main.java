import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fim;

		System.out.println("Entre com um valor inteiro de 1 a 100");
		int valor = sc.nextInt();

		if (valor < 1 || valor > 100)
			System.out.println("Valor invalido");

		else {

			if (valor % 2 == 0)
				fim = valor - 1;
			else
				fim = valor;
			
			System.out.println("Numeros impares de 1 ate " + valor);

			for (int i = 1; i <= fim; i = i + 2)
				System.out.println(i);

		}

		sc.close();

	}

}
