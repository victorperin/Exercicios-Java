/*****************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
* 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
* 		variável C é a temperatura em graus Celsius.

*****************************************************************************************************************/

import java.util.Scanner;

public class Exercicio{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; //Consegui colocar o nome de variável mais difícil do mundo! o/

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n"); //é basicamente uma cópia do exercício anterior
		
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = entrada.nextDouble();
		
		Calsius = (Fahrenheit - 32 ) * 5 / 9;

		System.out.print("\n A medida convertida é " + Calsius + "ºC\n");
		
	}

}
