/*
 QUESTÃO
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
 diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
 DIFERENCA = (A * B - C * D).
 ENTRADA
 O arquivo de entrada contém 4 valores inteiros.
 SAÍDA
 Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme 
 exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		int d = ler.nextInt();


		int diferenca = (a*b)-(c*d);
		
		System.out.println("DIFERENCA = " + diferenca);
	}
}
