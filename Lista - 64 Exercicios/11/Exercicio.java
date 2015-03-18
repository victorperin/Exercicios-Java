/*******************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,VariavelTemporaria;

      	System.out.print("Efetuador de troca de valores entre variaveis\n\n"); //Isso é estrutura condicional, mesmo?


      	System.out.print("Digite a variável A:  ");
      	A = entrada.nextInt();

      	System.out.print("Digite a variável B: ");
      	B = entrada.nextInt();



      	VariavelTemporaria = A;
        A = B;
        B = VariavelTemporaria;

        System.out.print("A="+A+" | B="+B+"\n");

    }

}
