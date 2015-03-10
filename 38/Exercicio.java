/*******************************************************************************
* 38) Faça um programa que leia as variáveis C e N, respectivamente código e
* número de horas trabalhadas de um operário. E calcule o salário sabendo-se que
* ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50, calcule o
* excesso de pagamento armazenando-o na variável E, caso contrário zerar tal
* variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
* imprimir o salário total e o salário excedente. O programa só deve parar de
* rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
* programa?".
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {
	private static double primeiro, segundo;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int C;
		double N,E=0,PrecoHora,PrecoExcedente;
		boolean continuar = true;
		char texto;

		do{
			E=0;
			PrecoHora=10;
			PrecoExcedente=PrecoHora*2;

			System.out.print("Digite o código do operário: ");
			C = entrada.nextInt();

			System.out.print("Digite o número de horas trabalhadas: ");
			N = entrada.nextDouble();

			if(N>50){
				E = N-50;
			}

			System.out.println("\nID: "+C+"\nSalario: "+(N*PrecoHora)+"\nSalario excedente: "+(E*PrecoExcedente)+"\nSalario total: "+(E*PrecoExcedente+N*PrecoHora)+"\n\nDeseja encerrar o programa?(s/N) ");
			texto = entrada.next().charAt(0);
			if(texto == 's' || texto == 'S'){
				continuar = false;
			}

		}while(continuar);

	}
}
