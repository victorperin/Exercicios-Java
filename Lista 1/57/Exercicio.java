/*******************************************************************************
* 57) Fazer um programa que leia uma frase e imprima somente as vogais.
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase,Vogais = "aeiouAEIOU",StringVogais = "";

		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();

		char[] ArrayChars = frase.toCharArray();

		for(int x=0;x<ArrayChars.length;x++){


			if(Vogais.contains(""+ArrayChars[x])){ // ""+Char - soma uma string "" com um charactere, transformando o caractere em string
				StringVogais+=ArrayChars[x];
			}
		}

		System.out.println("Nova frase: "+StringVogais);
	}
}
