/*****************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
* 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
* 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*****************************************************************************************************************/

import java.util.Scanner;

public class Exercicio{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; //Consegui colocar o nome de variável mais difícil do mundo! o/

		System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n"); //Pronto, bem mais simples!
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
		
	}

}
