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
	private static int[] Vetor = new int[10];
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		boolean continuar = true;
		while(continuar){
			System.out.print("Digite uma opção: ");
			int opcao = entrada.nextInt();
			switch(opcao){
				case 1:
					CarregarVetor();
					break;
				case 2:
					System.out.print(ListarVetor());
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
	//1 - Carregar Vetor
	public static void CarregarVetor(){
		for(int x=0;x<10;x++){
			System.out.print("Digite o "+(x+1)+"° número do vetor: ");
			Vetor[x]= entrada.nextInt();
		}
		System.out.println("\nVetor carregado com sucesso!\n");
	}
	//2 - Listar Vetor
	public static String ListarVetor(){
		String ListaVetor = "Valores do vetor:\n";
		for(int x=0;x<10;x++){
			ListaVetor += "\t"+Vetor[x]+"\n";
		}
		return ListaVetor;
	}
	//3 - Exibir apenas os números pares do vetor
	//4 - Exibir apenas os números ímpares do vetor
	//5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
	//6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor

}
