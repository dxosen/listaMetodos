package lista1exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorBase = 0;
		boolean multiNunConsec;
		


		System.out.print("Digite um valor inteiro e positivo :");
		valorBase = sc.nextInt();

		multiNunConsec = verificardorMultipNunConsec(valorBase);

		if (multiNunConsec == true) {
			System.out.println("O valor " + valorBase + (" e um numero quadrado"));
		} else {
			System.out.println("O valor " + valorBase + (" nao eh um numero quadrado"));

		}
	}

	public static boolean verificardorMultipNunConsec(int valorBase) {

		for (int i = 1; i < valorBase; i++) {
			for (int j = 1; j < valorBase; j++) {
				if (valorBase == (Math.pow(1, 2))) {
					System.out.println(j + "^" + i + " = " + (Math.pow(j, i)));
					return true;
				}

			}
		}

		return false;
	}

}
