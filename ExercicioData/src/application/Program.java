package application;

import java.util.Scanner;
import entities.Data;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Data data = new Data();
		
		System.out.print("Dia: ");
		data.dia = sc.nextInt();
		System.out.print("Mes: ");
		data.mes = sc.nextInt();
		System.out.print("Ano: ");
		data.ano = sc.nextInt();
		
		System.out.println();
		System.out.println("Data: " + data);
		System.out.println("Mes: " + data.getMesExtenso());
		
		
		System.out.println("Nova data:");
		System.out.print("Dia: ");
		int dia = sc.nextInt();
		System.out.print("Mes: ");
		int mes = sc.nextInt();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		
		System.out.println(data.compara(dia, mes, ano));			
		
		sc.close();

	}

}
