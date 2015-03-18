/*******************************************************************************
* Escreva um programa que calcule e retorne o valor da hipotenusa através do
* método HIPOTENUSA. O método recebe o valor da base e da altura de um triângulo
* Fórmulas: hipotenusa² = base² + altura²
*             base x altura
*    área = -----------------
*                  2
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o tamanho da base: ");
		double base = entrada.nextDouble();
		System.out.print("Digite o tamanho da altura: ");
		double altura = entrada.nextDouble();
		System.out.println("A hipotenusa é : "+Hipotenusa(base,altura));
	}
	public static double Hipotenusa(double Base,double Altura){
		double hipotenusa = (Base*Base) + (Altura*Altura);
		hipotenusa = Math.sqrt(hipotenusa);
		return hipotenusa;
	}



}
