/*******************************************************************************
* 64) Escreva um programa que deverá ter as seguintes opções:
* 1 - Carregar Vetor
* 2 - Listar Vetor
* 3 - Exibir apenas os números pares do vetor
* 4 - Exibir apenas os números ímpares do vetor
* 5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
* 6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
* 7 - Sair
* Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		while(continuar){
			System.out.print("Digite uma opção: ");
			int opcao = entrada.nextInt();
			switch(opcao){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					continuar = false;
					break;
				default:
					System.out.println("Número inválido.");
			}
		}
	}

}
