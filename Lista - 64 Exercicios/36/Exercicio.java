/*******************************************************************************
* 36) Faça um programa que leia 10 valores inteiros e positivos e:
* - Encontre o maior valor
* - Encontre o menor valor
* - Calcule a média dos números lidos
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays; //Importando ferramentas para array

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade_numeros = 10; // configuração: mude esta quantidade para mudar quantos números o usuário vai escrever
		double media=0;
		int[] numeros = new int[quantidade_numeros];

  for(int x = 0; x < quantidade_numeros; x++){
    System.out.print("Digite o "+(x+1)+"° número: ");
    numeros[x]= entrada.nextInt();
		media += numeros[x];
  }
	media = media / quantidade_numeros;
	Arrays.sort(numeros);//organiza os arrays em ordem crescente

	System.out.println("\nO menor número é: "+numeros[0]);
	System.out.println("O maior número é: "+numeros[quantidade_numeros - 1]);
	System.out.println("A média dos números é: "+media);


	}
}
