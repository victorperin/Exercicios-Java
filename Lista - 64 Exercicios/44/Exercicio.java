/*******************************************************************************
* 44) Faça um programa que exiba as opções:
* 	1 – Conversão de Graus Celsius em Graus Fahrenheit
* 	2 – Conversão de Graus Fahrenheit em Graus Celsius
* 	3 – Peso ideal do homem
* 	4 – Peso ideal da mulher
* O programa só deve encerrar quando o usuário digitar  ́S ́ para a pergunta
*  “Deseja encerrar o programa?”
* Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		char letra;
		int opcao;

		do{
			do{
				System.out.print("Digite uma das opções:\n\t1 – Conversão de Graus Celsius em Graus Fahrenheit\n\t2 – Conversão de Graus Fahrenheit em Graus Celsius\n\t3 – Peso ideal do homem\n\t4 – Peso ideal da mulher\n\n");
				opcao = entrada.nextInt();
				if(opcao<1||opcao>4) System.out.print("Opção Errada.\n");
			}while(opcao<1||opcao>4);
			double Celsius, Fahrenheit;
			double Altura,PesoIdeal;
			switch(opcao){
				case 1:
					System.out.print("Digite a temperatura em °C: ");
					Celsius = entrada.nextDouble();
					Fahrenheit = (Celsius * 1.8) + 32;
					System.out.print("A temperatura convertida é: "+Fahrenheit+"°F.\n");
					break;
				case 2:
					System.out.print("Digite a temperatura em °F: ");
					Fahrenheit = entrada.nextDouble();
					Celsius = (Fahrenheit - 32) / 1.8;
					System.out.print("A temperatura convertida é: "+Celsius+"°C.\n");
					break;
				case 3:
					System.out.print("Digite a altura: ");
					Altura = entrada.nextDouble();
					PesoIdeal=(72.7*Altura) - 58;
					System.out.print("Seu peso ideal é: "+PesoIdeal+"kg");
					break;
				case 4:
					System.out.print("Digite a altura: ");
					Altura = entrada.nextDouble();
					PesoIdeal=(62.1 *Altura) - 44.7;
					System.out.print("Seu peso ideal é: "+PesoIdeal+"kg");
					break;
				default:
					System.out.print("Opção Errada.\n");
			}

			System.out.println("\nDeseja encerrar o programa? (s/N) ");
			letra = entrada.next().charAt(0);
			if(letra == 's' || letra == 'S'){
				continuar = false;
			}
		}while(continuar);

	}
}
