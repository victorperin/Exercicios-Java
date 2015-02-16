/*******************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/

import java.util.Scanner;
import java.util.Arrays; //usando o método de arrays da biblioteca java

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Quantidade = 3; //Este valor é igual a quantidade de números para adicionar ao array.
        int[] Numeros = new int[Quantidade]; //Inicia os valores com a mesma quantidade de valores da variável "Quantidade"

      	System.out.print("Ordenador de números\n\n");

        for (int x = 0; x < Quantidade; x++) {
          System.out.print("Digite o "+(x+1)+" número:  ");
          Numeros[x] = entrada.nextInt();
        }

        Arrays.sort(Numeros); //Usando o método de arrays para organizar automaticamente os arrays para mim

        System.out.println("\n\nOs números em ordem crescente são:");
        for (int Numero : Numeros) {
          System.out.println(Numero);
        }
    }

}
