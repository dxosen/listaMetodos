package lista1exercicios;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.print("Digite o valor de n: ");
		n = sc.nextInt();
		int somaFibonacci = calculaExpressao(n);

		System.out.println("A soma dos primeiros " + n + " numeros da sequencia de fibonacci eh: " + (somaFibonacci));
	}

	public static int calculaExpressao(int n) {
		int y = 0;
		int fibonacci[] = new int[n];

		for (int i = 0; i < n; i++) {

			if (i > 1) {
				fibonacci[i] = fibonacci[(i - 1)] + fibonacci[(i - 2)];
			} else {
				fibonacci[i] = 1;
			}
			y += fibonacci[i];
		}

		return y;
	}

}
