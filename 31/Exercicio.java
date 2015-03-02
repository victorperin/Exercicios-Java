/*******************************************************************************
* 31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número
* lido é par ou ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos
* números ímpares lidos. Suporemos que o número de elementos deste conjunto não é
* conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

  public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);
    int Numero=0,QuantPar=0,QuantImpar=0;
	
	while(Numero>=0){
	
		System.out.print("Digite um número (numeros negativos finalizam): ");
		Numero = entrada.nextInt();
		if(Numero>=0){
			if(Numero%2==0){
				QuantPar++;
			}else{
				QuantImpar++;
			}
		}
	}
    
	System.out.println("\n\nQuantidade de Números Pares: "+QuantPar+"\nQuantidade de Números Impares: "+QuantImpar);
	
  }
}
