package br.com.erickfreire.ladodeumtriangulodireito;

import java.util.Scanner;

/**
 * Programa em Java que verifica se três valores formam um triângulo direito (triângulo retângulo)
 * @author Erick Freire
 * @version 1 - Criado em 13-04-2021 as 13:43
 */

public class LadoDeUmTrianguloDireito {
	public static void main(String[] args) {
		int lado1;
		int lado2;
		int lado3;
		int calculo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se três valores formam um triângulo direito: ");
		
		System.out.print("Informe o valor do lado 1: ");
		lado1 = entrada.nextInt();
		
		System.out.print("Informe o valor do lado 2: ");
		lado2 = entrada.nextInt();
		
		System.out.print("Informe o valor do lado 3: ");
		lado3 = entrada.nextInt();
		
		calculo = (int)Math.pow(lado1, 2) + (int)Math.pow(lado2, 2);
		
		if(calculo == (int)Math.pow(lado3, 2))
			System.out.print("É um triângulo direito");
		else
			System.out.print("Não é um triângulo direito");
	}

}
