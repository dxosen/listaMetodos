package lista1exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorBase = 0;
		boolean multiNunConsec;

		System.out.print("Digite um valor inteiro e positivo :");
		valorBase = sc.nextInt();

		multiNunConsec = verificardorMultipNunConsec(valorBase);

		if (multiNunConsec == true) {
			System.out.println(
					"O valor " + valorBase + (" e formado pela multiplicação de três números inteiros consecutivos"));
		} else {
			System.out.println("O valor " + valorBase
					+ (" nao e formado pela multiplicação de três números inteiros consecutivos"));

		}
	}

	public static boolean verificardorMultipNunConsec(int valorBase) {

		for (int i = 1; i < valorBase; i++) {

			if (valorBase == (i * (i + 1) * (i + 2))) {
				System.out.println(i +" *" +(i+1) +" *" + (i+2) +" = "+(i * (i + 1) * (i + 2)) );
				return true;
			}

		}

		return false;
	}

}
