package lista1exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1 {
	public static DecimalFormat formatTemp = new DecimalFormat("0.0##");
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		double valorMenor=0;
		double valorMaior=0;
		double acrescimo=0;
		
		System.out.println("--- TABELA CONVERT C PARA F ---");
		
		System.out.print("Digite o menor valor em Celsius: ");
		valorMenor=sc.nextDouble();
		
		System.out.print("Digite o maior valor em Celsius: ");
		valorMaior=sc.nextDouble();
		
		System.out.print("Digite o valor de acrescimo: ");
		acrescimo=sc.nextDouble();
		

		tabelaConversao(valorMenor,valorMaior,acrescimo);

	}
	public static void tabelaConversao(double valorMenor,double valorMaior,double acrescimo) {
		// TC/5 = (TF – 32)/9,
		
		for (double i=valorMenor;i<=valorMaior;) {
			System.out.println(i+" TC = "+ formatTemp.format((i*1.8)+32)+" TF");
			i+=acrescimo;
	}
	}
}
