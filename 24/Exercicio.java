/*******************************************************************************
* 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
* realizar:
* 1 – Verificar se um dos números lidos é ou não múltiplo do outro
* 2 – Verificar se os dois números lidos são pares
* 3 – Verificar se a média dos dois números é maior ou igual a 7.
* 4 – Sair
*******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PrimeiroNumero,SegundoNumero,Resultado;
		    int Menu;
        boolean LoopMenu = true;


		System.out.print("Digite o primeiro número: ");
		PrimeiroNumero = entrada.nextDouble();

		System.out.print("Digite o segundo número: ");
		SegundoNumero = entrada.nextDouble();

    while(LoopMenu){
      System.out.print("\nVocê deseja verificar se...\n\t1 - um dos números lidos é ou não múltiplo do outro\n\t2 - os dois números lidos são pares\n\t3 - a média dos dois números é maior ou igual a 7\n\t4 - Sair\n");
      Menu = entrada.nextInt();
  		switch(Menu){
  			case 1:
          if(PrimeiroNumero%SegundoNumero==0||SegundoNumero%PrimeiroNumero==0){
            System.out.println("Sim, um dos números é múltiplo do outro");
          }else{
            System.out.println("Não, nenhum dos números é múltiplos do outro");
          }
  				break;
  			case 2:
          if(PrimeiroNumero%2==0&&SegundoNumero%2==0){
  				  System.out.println("Sim, os dois números lidos são pares.");
          }else{
            System.out.println("Não, os dois números lidos são ímpares.");
          }
  				break;
  			case 3:
          if((PrimeiroNumero+SegundoNumero)/2 >= 7){
            System.out.println("Sim, a média dos dois números é maior ou igual a 7.");
          }else{
            System.out.println("Não, a média dos dois números não é maior ou igual a 7.");
          }
  				break;
  			case 4:
          LoopMenu = false;
  				System.out.print("Saindo...\n");
  				break;
  			default:
  				System.out.println("Opção inválida!");
  		}
    }


	}

}
