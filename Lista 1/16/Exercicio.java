/*******************************************************************************
* 16) Escreva um programa que leia dois números e exiba mensagem informando o
* valor do maior número e o valor do menor número. Se os dois números forem
* iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int PrimeiroNumero, SegundoNumero;

      	System.out.print("Verificador de números\n\n");


        System.out.print("Digite o primeiro número:  ");
        PrimeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número:  ");
        SegundoNumero = entrada.nextInt();


        if(PrimeiroNumero > SegundoNumero){
          System.out.println("O primeiro número é maior que o segundo número.");
        }else if(PrimeiroNumero <SegundoNumero){
          System.out.println("O primeiro número é menor que o segundo número.");
        }else{
          System.out.println("Os dois números são iguais.");
        }

    }

}
