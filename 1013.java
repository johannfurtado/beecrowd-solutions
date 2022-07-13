/*
 QUESTÃO
 Faça um programa que leia três valores e apresente o maior dos três 
 valores lidos seguido da mensagem “eh o maior”.
 ENTRADA
 O arquivo de entrada contém três valores inteiros.
 SAÍDA
 Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		int maiorAB = (a+b+Math.abs(a-b))/2;
		int maior = (maiorAB+c+Math.abs(maiorAB-c))/2;
		
    System.out.println(maior + " eh o maior");
		
	}
}
