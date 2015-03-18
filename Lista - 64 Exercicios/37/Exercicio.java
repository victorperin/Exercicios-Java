/*******************************************************************************
* 37) Faça um programa de conversão de base numérica. O programa deverá
* apresentar uma tela de entrada com as seguintes opções:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
* Informe a opção:
* A partir da opção escolhida, o programa deverá solicitar para que o usuário
* digite dois números. Em seguida, o programa deve exibir o resultado da opção
* indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao menu
* principal. Caso a resposta seja  ́S ́ ou  ́s ́, deverá voltar ao menu, caso
* contrário deverá encerrar o programa.
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays; //Importando ferramentas para array

public class Exercicio {
	private static double primeiro, segundo;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		String charOpcao;
		boolean encerrar=false;

		while(encerrar==false){

			System.out.println("Digite uma das opções para as operações:\n1 – Adição\n2 – Subtração\n3 – Multiplicação\n4 – Divisão\nopção: ");
			opcao = entrada.nextInt();

			switch(opcao){
				case 1:
					pegar_numeros();
					System.out.println("Resultado de "+primeiro+"+"+segundo+"="+(primeiro+segundo));
					break;
				case 2:
					pegar_numeros();
					System.out.println("Resultado de "+primeiro+"-"+segundo+"="+(primeiro-segundo));
					break;
				case 3:
					pegar_numeros();
					System.out.println("Resultado de "+primeiro+"*"+segundo+"="+(primeiro*segundo));
					break;
				case 4:
					pegar_numeros();
					System.out.println("Resultado de "+primeiro+"/"+segundo+"="+(primeiro/segundo));
					break;
				default:
					System.out.println("Opção inválida, digite novamente a opção: ");
					opcao = entrada.nextInt();
			}
			System.out.println("Deseja continuar?(s/n)");
			charOpcao = entrada.next();
			if(charOpcao=="N"||charOpcao=="n"){
				encerrar = true;
			}
		}



	}

	public static void pegar_numeros(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		primeiro = entrada.nextDouble();

		System.out.println("Digite o segundo número: ");
		segundo = entrada.nextDouble();
	}




}
