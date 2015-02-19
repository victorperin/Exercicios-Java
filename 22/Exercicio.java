/*******************************************************************************
* 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for
* negativo, em B. No final mostrar o resultado.
*******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A=0, B=0, Numero;
      	System.out.print("Organizador de números\n\n"); //O texto do exercício é muito vago, mas acho que é isso o que ele quis dizer:

    		do {
          System.out.print("Digite um número, digite 0 para sair: ");
          Numero = entrada.nextDouble();
          if(Numero>0){
            A += Numero;
            System.out.print("Numero armazenado em A\n");
          }else if(Numero < 0){
            B += Numero;
            System.out.print("Numero armazenado em B\n");
          }
        }while(Numero != 0);
        System.out.printf("A= %2f\nB= %2f\n",A,B);
	}
}
