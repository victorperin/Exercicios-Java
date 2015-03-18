/*******************************************************************************
* 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
* programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
* (h = altura)
*   - Para homens: (72.7*h) - 58
*   - Para mulheres: (62.1 *h) - 44.7
*******************************************************************************/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double Altura,PesoIdeal;
	    char Sexo='n';

  		System.out.print("Digite sua altura (em metros): ");
      Altura = entrada.nextDouble();

      while(Sexo !='m' && Sexo !='M' && Sexo !='h' && Sexo !='H'){

        System.out.print("Digite H ou M para especificar o sexo: "); // o/
        Sexo = entrada.next(".").charAt(0);

        switch(Sexo){
          case 'h':
          case 'H':
            PesoIdeal = ( 72.7* Altura ) - 58;
            System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
            break;
          case 'm':
          case 'M':
            PesoIdeal = ( 62.1 * Altura ) - 44.7;
            System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
            break;
          default:
            System.out.println("Não é M");
        }

      }
	}

}
