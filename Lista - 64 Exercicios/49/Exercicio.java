/*******************************************************************************
* 49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
* Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas
* mesmas posições.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int NumeroComponentes;

		System.out.print("Digite o número de posições: ");
		NumeroCOmponentes = entrada.nextInt();
		System.out.println();

		int[]v1= new int[NumeroComponentes];
		int[]v2= new int[NumeroComponentes];

		for(int x=0;x<NumeroComponentes;x++){
			System.out.print("Digite um valor para a posição "+(x+1)+" do vetor 1: ");
			v1[x]= entrada.nextInt();
		}
		for(int x=0;x<NumeroComponentes;x++){
			System.out.print("Digite um valor para a posição "+(x+1)+" do vetor 2: ");
			v2[x]= entrada.nextInt();
		}
		System.out.println();
		for(int x=0;x<NumeroComponentes;x++){
			if(v1[x]==v2[x]){
				System.out.println("Valores das Posições "+(x+1)+" dos vetores é igual.");
			}
		}


	}
}
