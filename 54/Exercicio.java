/*******************************************************************************
* 54) Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em
* C que imprima todos os elementos comuns aos dois vetores.
*******************************************************************************/
//Não, isso não é um programa em C... apenas especifique o vetor C
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//utilizando a classe pronta de List e ArrayLists do java, para alocar memória da maneira correta 


public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] A= new int[5], B = new int[8];
		List<Integer> C = new ArrayList<Integer>();
		int w=0;
		for(int x=0;x<5;x++){
			System.out.print("Digite um número para o vetor A: ");
			A[x] = entrada.nextInt();
		}
		for(int x=0;x<8;x++){
			System.out.print("Digite um número para o vetor B: ");
			B[x] = entrada.nextInt();
			for(int y=0;y<5;y++){
					if(B[x]==A[y]){
						C.add(w, B[x]);
						w++;
					}
			}
		}
		System.out.print("Números comuns: ");
		for(int x=0; x<C.size();x++){

			System.out.print(C.get(x)+" ");
		}
		System.out.println();


	}
}
