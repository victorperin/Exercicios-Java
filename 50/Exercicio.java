/*******************************************************************************
* 50) Fazer um programa que sorteie um número de 0 a 100 e que permita que o
* usuário (sem conhecer o número sorteado) tente acertar. Caso não acerte, o
* programa deve imprimir uma mensagem informando se o número sorteado é maior ou
* menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a
* quantidade de tentativas feitas.
*******************************************************************************/
// EXTRA: Adicionei o número de tentativas, tornando um pouco mais útil.
import java.util.Scanner;
import java.util.Random;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		boolean acertou = false;
		int chute,tentativas =0;

		int numero = gerador.nextInt(101);

		while(acertou == false){
			System.out.print("Digite um número de 0 a 100: ");
			chute = entrada.nextInt();
			tentativas++;
			if(chute == numero){
				System.out.println("Você acertou em "+tentativas+" tentativas!");
				acertou = true;
			}else if (chute > numero){
				System.out.println("O número é menor.");
			}else{
				System.out.println("O número é maior.");
			}
		}



	}
}
