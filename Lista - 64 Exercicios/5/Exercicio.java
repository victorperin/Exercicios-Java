/*****************************************************************************************************************
* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
* 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
* 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
* 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
* 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
* 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double VelocidadeMedia, TempoGasto, Autonomia = 12; //Velocidade média em Km/h, Tempo gasto em horas e autonomia em Km/L
		double Distancia, LitrosUsados;		

		System.out.print("Programa de cálculo da quantidade de litros de combustível gasta em uma viagem\n\n"); //Por que títulos tão grandes?!
		
		
		System.out.print("Por favor, digita o tempo que você gastou em sua viagem (horas): ");
		TempoGasto = entrada.nextDouble();
		
		System.out.print("Por favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
		VelocidadeMedia = entrada.nextDouble();

		
		Distancia = VelocidadeMedia * TempoGasto;
		LitrosUsados = Distancia / Autonomia;


		System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h\n");
		System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
		System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
		System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");

	}

}
