import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total;
		
		System.out.println("Digite o horario do inicio do jogo");
		int inicio = sc.nextInt();
		
		System.out.println("Digite o horario do fim do jogo");
		int fim = sc.nextInt();
		
		if (fim <= inicio)
			total = (24 - inicio) + fim;
		
		else
			total = fim - inicio;
		
		System.out.println("O jogo durou " + total + " horas");
		
		sc.close();

	}

}
