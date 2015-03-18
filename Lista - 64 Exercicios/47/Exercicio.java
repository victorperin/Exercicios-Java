/*******************************************************************************
* 47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número
* inteiro, também positivo e maior que zero. Faça um programa para:
* 		a. ler pelo teclado o vetor;
* 		b. ler pelo teclado o número X;
* 		c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// a. ler pelo teclado o vetor;
		int[] vetor = new int[10];
		for(int x=0;x<10;x++){
			System.out.print("Digite o "+(x+1)+"° Número do vetor: ");
			vetor[x]= entrada.nextInt();
		}
		
		// b. ler pelo teclado o número X;
		int numeroX;
		System.out.print("Digite o número X: ");
		numeroX= entrada.nextInt();
		
		int maiores=0, menores=0, iguais=0;
		System.out.print("Números maiores que o número X:\n");
		for(int w=0;w<10;w++){
			if(vetor[w]>numeroX){
				System.out.println(vetor[w]);
				maiores++;
			}
			else if(vetor[w]==numeroX){
				iguais++;
			}
			else{
				menores++;
			}
		}
		// c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
		System.out.print("\nMaiores: "+maiores+"\nIguais: "+iguais+"\nMenores: "+menores+"\n");

	}
}
