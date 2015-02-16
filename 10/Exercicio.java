/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int PrimeiroNumero, SegundoNumero;
	boolean Igual=false, NaoIgual=false, Maior=false, Menor=false, MaiorOuIgual=false, MenorOuIgual=false;	

	System.out.print("Mostrador de relacionamentos\n\n"); //Mais um exercício away


	System.out.print("Digite o primeiro número:  ");
	PrimeiroNumero = entrada.nextInt();
	
	System.out.print("Digite o segundo número: ");
	SegundoNumero = entrada.nextInt();
	
	if(PrimeiroNumero == SegundoNumero) Igual = true;
	if(PrimeiroNumero != SegundoNumero) NaoIgual = true;
	if(PrimeiroNumero > SegundoNumero) Maior = true;
	if(PrimeiroNumero < SegundoNumero) Menor = true;
	if(PrimeiroNumero >= SegundoNumero) MaiorOuIgual = true;
	if(PrimeiroNumero <= SegundoNumero) MenorOuIgual = true;

	System.out.println("\nIgual = "+Igual);
	System.out.println("Não Igual = "+NaoIgual);
	System.out.println("Maior = "+Maior);
	System.out.println("Menor = "+Menor);
	System.out.println("Maior ou igual = "+MaiorOuIgual);
	System.out.println("Menor ou igual = "+MenorOuIgual);
		
    }

}

