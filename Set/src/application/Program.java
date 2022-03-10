/*
 * Um site de internet registra um log de acessos dos usuários. 
 * Um registro de log consiste no nome de usuário (apenas uma palavra) e o instante em que o usuário acessou o site no padrão ISO 8601, separados por espaço. 
 * Fazer um programa que leia o log de acessos a partir de um arquivo, e daí informe quantos usuários distintos acessaram o site.
 *
 * input file example:
 * amanda 2018-08-26T20:45:08Z
 * alex86 2018-08-26T21:49:37Z
 * bobbrown 2018-08-27T03:19:13Z
 * amanda 2018-08-27T08:11:00Z
 * jeniffer3 2018-08-27T09:19:24Z
 * alex86 2018-08-27T22:39:52Z
 * amanda 2018-08-28T07:42:19Z
 *
 */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String file = sc.nextLine(); // /home/anapaula/Documents/in.txt

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			Set<LogEntry> set = new HashSet<>(); // É o mais rápido e, neste problema, não importa a ordem dos usuários

			String line = br.readLine();

			while (line != null) {

				String[] split = line.split(" ");
				String username = split[0];
				Date moment = Date.from(Instant.parse(split[1]));

				set.add(new LogEntry(username, moment));

				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
			
		}

		catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

		sc.close();
	}

}
