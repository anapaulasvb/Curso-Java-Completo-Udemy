package entities;

public class Data {

	public int dia;
	public int mes;
	public int ano;

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public String compara (int dia, int mes, int ano) {
		if (this.dia == dia && this.mes == mes && this.ano == ano) {
			return "Datas iguais";
		} else
			return "Datas diferentes";
	}

	public String getMesExtenso() {
		switch(mes) {
		case 1: return "Janeiro";
		case 2: return "Fevereiro";
		case 3: return "Marco";
		case 4: return "Abril";
		case 5:	return "Maio";
		case 6: return "Junho";
		case 7: return "Julho";
		case 8: return "Agosto";
		case 9: return "Setembro";
		case 10: return "Outubro";
		case 11: return "Novembro";
		case 12: return "Dezembro";
		default: return "Mes invalido";	
		}
	}

}
