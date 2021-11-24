package application;

import java.util.Scanner;
import entities.Fatorial;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fatorial fatorial = new Fatorial();
		
		System.out.print("Numero para calcular o fatorial: ");
		fatorial.numero = sc.nextInt();
		
		System.out.print("Fatorial: " + fatorial.resultado());
				
		sc.close();

	}

}
