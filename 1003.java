/*
 QUESTÃO
 Leia dois valores inteiros, no caso para variáveis A e B. A seguir, 
 calcule a soma entre elas e atribua à variável SOMA. A seguir escrever
 o valor desta variável.
 ENTRADA
 O arquivo de entrada contém 2 valores inteiros.
 SAÍDA
 Imprima a variável SOMA com todas as letras maiúsculas, com um espaço 
 em branco antes e depois da igualdade seguido pelo valor correspondente à 
 soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de 
 linha após o resultado, caso contrário, você receberá "Presentation Error".
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		System.out.println("SOMA = " + (a + b));
	
	}
}
