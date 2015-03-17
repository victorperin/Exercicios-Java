/*******************************************************************************
* 61) Escreva um programa que calcule e retorne o salário atualizado através do
* método REAJUSTE. O método deve receber o valor do salário e o índice de
* reajuste.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o salario atual: ");
		double SalarioAtual = entrada.nextDouble();
		System.out.print("Digite o percentual de reajuste: ");
		double Reajuste = (entrada.nextDouble()/100);
		System.out.println("O novo salario é de R$"+String.format( "%.2f", Reajuste(SalarioAtual,Reajuste) )+".");
	}
	public static double Reajuste(double Salario,double IndiceReajuste){
		double NovoSalario = Salario + (Salario*IndiceReajuste);
		return NovoSalario;
	}



}
