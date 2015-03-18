/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
*******************************************************************************/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int IdadeAnos /* not anus! */, IdadeMeses, IdadeDias, IdadeTotalDias;
	
	System.out.print("Calculadora de idade em dias\n\n"); //Existe algum exercício mais aleatório do que esse?!


	System.out.print("Digite os anos: ");
	IdadeAnos = entrada.nextInt();
	
	System.out.print("Digite os meses: ");
	IdadeMeses = entrada.nextInt();

	System.out.print("Digite os dias: ");
	IdadeDias = entrada.nextInt();


	IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
	System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");
	
    }

}

