/*
 QUESTÃO
 Calcule o consumo médio de um automóvel sendo fornecidos a distância 
 total percorrida (em Km) e o total de combustível gasto (em litros).
 ENTRADA
 O arquivo de entrada contém dois valores: um valor inteiro X representando 
 a distância total percorrida (em Km), e um valor real Y representando o 
 total de combustível gasto, com um dígito após o ponto decimal.
 SAÍDA
 Apresente o valor que representa o consumo médio do automóvel com 3 casas 
 após a vírgula, seguido da mensagem "km/l".
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int distancia = ler.nextInt();
		float gasolinaGasta = ler.nextFloat();
		
		double consumo = distancia / gasolinaGasta;
		
		System.out.println(String.format("%.3f km/l", consumo));
		
	}
}
