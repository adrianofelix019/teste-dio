package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int a = in.nextInt();
		
		System.out.print("Informe outro numero; ");
		int b = in.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		float divisao = divisao(a, b);
		
		
		System.out.println("O resultado da soma e " + soma);
		System.out.println("O resultado da subtracao e " + subtracao);
		System.out.println("O resultado da multipliacao e " + multiplicacao);
		System.out.println("O resultado da divisao e " + divisao);
		
		in.close();
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static float divisao(int a, int b) {
		return a / (float) b;
	}
}
