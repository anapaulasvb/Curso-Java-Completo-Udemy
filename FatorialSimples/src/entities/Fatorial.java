package entities;

public class Fatorial {

	public int numero;

	public int resultado() {

		int N = 1;

		for (int i = 0; i < numero; i++) {
			N = N * (numero - i);
		}

		return N;

	}

}
