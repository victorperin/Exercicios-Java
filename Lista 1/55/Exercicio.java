/*******************************************************************************
* 55) Fazer um programa que leia uma frase de até 50 caracteres e imprima a
* frase sem os espaços em branco.
* Imprimir também a quantidade de espaços em branco da frase.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		String NovaFrase="";

		do{
			System.out.print("Digite sua frase (até 50 characteres) :");
			frase = entrada.nextLine();
		}while(frase.length()>50);

		char[] ArrayChars = frase.toCharArray();

		for (int x=0;x<ArrayChars.length;x++){
			if(ArrayChars[x]!=' '){
				NovaFrase = NovaFrase+ArrayChars[x];
			}
		}
		System.out.println("Nova frase: "+NovaFrase);

	}
}
