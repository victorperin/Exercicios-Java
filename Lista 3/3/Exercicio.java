/*******************************************************************************
3. Implementar uma classe Data que deve possuir como características os atributos dia, mês e ano (todas do
tipo inteiro). Nesta classe além dos métodos construtores, getters, setters e toString, deverá ser
implementado o método validarData (int, int, int): boolean que deverá verificar se as informações passadas
por parâmetros é verdadeira ou não. Este método deverá inclusive verificar se é ano bissexto. O método
toString deverá retornar uma string no seguinte formato “dia/mês/ano”, como por exemplo
“05/março/2015”

*******************************************************************************/
//obs: um ano é bissexto quando o mesmo é divisível por 4
import java.util.Scanner;

public class Exercicio{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia,mes,ano;
		System.out.print("Digite o dia: ");
		dia = entrada.nextInt();
		System.out.print("Digite o mês: ");
		mes = entrada.nextInt();
		System.out.print("Digite o ano: ");
		ano = entrada.nextInt();



		Data calendario = new Data(dia,mes,ano);
		if(calendario.validarData(dia,mes,ano)){
			System.out.print(calendario.getDia());
		}else{
			System.out.print("False");
		}
	}
}
