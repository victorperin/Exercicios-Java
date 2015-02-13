/*****************************************************************************************************************
* 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
* 		V = 3.14159 * R * R * A
* 		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*****************************************************************************************************************/

import java.util.Scanner;

public class Exercicio{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double RaioLata, AlturaLata, VolumeLata;

		System.out.print("Cálculo de volume de lata de óleo\n\n"); //Porque lata de óleo é especial
		
		
		System.out.print("Digite diâmeto da lata (em cm): ");
		RaioLata = entrada.nextDouble()/2;
		
		System.out.print("Digite a altura da lata (em cm): ");
		AlturaLata = entrade.nextDouble();
		
		
		VolumeLata = Math.PI * RaioLata * RaioLata * AlturaLata;

		System.out.print("\n O volume da lata é de " + VolumeLata + " cm³\n");
		
	}

}