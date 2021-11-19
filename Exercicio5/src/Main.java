import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Entre com o tipo de combustivel abastecido");
		int tipo = sc.nextInt();
		// 1.Álcool 2.Gasolina 3.Diesel 4.Fim

		while (tipo != 4) {

			if (tipo == 1)
				alcool++;
			else if (tipo == 2)
				gasolina++;
			else if (tipo == 3)
				diesel++;

			tipo = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool = %d %nGasolina = %d %nDiesel = %d", alcool, gasolina, diesel);

		sc.close();

	}

}
