/*******************************************************************************
* 56) Fazer um programa para ler um vetor de inteiros positivos de 50 posições.
* Imprimir a quantidade de números pares e de múltiplos de 5.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] NumerosInteiros = new int[50];
		int QuantidadeParesMaioresDe5 = 0, x=0;

		while(x<50){
			System.out.print("Digite um número inteiro para a posição "+(x+1)+": ");
			NumerosInteiros[x] = entrada.nextInt();
			if(NumerosInteiros[x]>=0){
				if(NumerosInteiros[x]%5==0&&NumerosInteiros[x]%2==0){
					QuantidadeParesMaioresDe5++;
				}
				x++;
			}
		}

		System.out.println("\nA quantidade de números pares e multiplos de 5 é: "+QuantidadeParesMaioresDe5);
	}
}
