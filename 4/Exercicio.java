/*************************************************************************
 * 4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
 * 	valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
 * 	A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 * 	com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
 * 	devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
 * 	multiplicações.

*************************************************************************/

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[4] ;
		
		System.out.print("Exercício 4, leia o enunciado.\n\n"); //Desisto!
		
		for(int i=0; i<4; i++){
			System.out.print("Digite o valor "+(i+1)+": ");
			valores[i] = entrada.nextInt();
		}
		
		System.out.print("\nResultados:\n\n");
		
		System.out.print("Valor 1 e Valor 2:\n");
		System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

		System.out.print("Valor 1 e Valor 3:\n");
		System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

		System.out.print("Valor 1 e Valor 4:\n");
		System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");
		
		System.out.print("Valor 2 e Valor 3:\n");
		System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

		System.out.print("Valor 2 e Valor 4:\n");
		System.out.print("	"+valores[1]+" + "+valores[3]+" = "+(valores[1]+valores[3])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

		System.out.print("Valor 3 e Valor 4:\n");
		System.out.print("	"+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
		System.out.print("	"+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");
	}

}
















