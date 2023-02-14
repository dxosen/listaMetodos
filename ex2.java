package lista1exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {
	public static DecimalFormat formatY = new DecimalFormat("0.00#");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = 0;

		System.out.print("Digite o valor de X: ");
		x = sc.nextDouble();
		double y = calculaExpressao(x);

		System.out.println("y= " + formatY.format(y));
	}

	public static double calculaExpressao(double x) {
		double y = (((5 * x) + 3) / (Math.sqrt((Math.pow(x, 2) - 16))));

		return y;
	}

}
