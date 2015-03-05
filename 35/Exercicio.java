/*******************************************************************************
* 35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma
* mensagem: "Múltiplo de 10".
*******************************************************************************/

public class Exercicio {

	public static void main(String[] args) {

		int numero;

  for(numero = 1; numero <= 100; numero++){
    if(numero%10==0) System.out.println(numero+" -- multiplo de 10");
    else System.out.println(numero);
  }

	}
}
