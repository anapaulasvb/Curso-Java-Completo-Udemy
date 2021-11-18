import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dois numeros inteiros:");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();

		if (((numero1 % numero2) == 0) || ((numero2 % numero1) == 0))
			System.out.println("Sao multiplos");

		else
			System.out.println("Nao sao multiplos");

		sc.close();

	}

}
