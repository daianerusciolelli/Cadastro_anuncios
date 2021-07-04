package programa_calculadora;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int valorInvestido = 0;
		int compartilhamento = 30;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual valor investido no anuncio?");
		valorInvestido = sc.nextInt();

		System.out.println("Pessoas que visualizaram o anuncio original = " + valorInvestido * compartilhamento);

		sc.close();

	}

}
