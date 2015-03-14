/*******************************************************************************
* 53) Durante uma corrida de automóveis com N voltas de duração foram anotados
* para um piloto, na ordem, os tempos registrados em cada volta. Fazer um
* programa para ler os tempos das N voltas, calcular e imprimir:
* 	i. melhor tempo;
* 	ii. a volta em que o melhor tempo ocorreu;
* 	iii. tempo médio das N voltas;
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int NumeroVoltas,total=0,media,MelhorTempo=0,MelhorVolta=0;

		System.out.print("Digite o número de voltas: ");
		NumeroVoltas = entrada.nextInt();

		int[] tempos = new int[NumeroVoltas];
		for(int x=0;x<NumeroVoltas;x++){
			System.out.print("Digite o tempo da "+(x+1)+"ª volta (em segundos): ");
			tempos[x] = entrada.nextInt();
			total+=tempos[x];
			if(tempos[x]<MelhorTempo||x==0){
				MelhorTempo = tempos[x];
				MelhorVolta = x+1;
			}
		}
		media = total/NumeroVoltas;


		System.out.println("i.   O melhor tempo foi: "+MelhorTempo+" segundos.");
		System.out.println("ii.  Melhor volta foi a "+MelhorVolta+"ª.");
		System.out.println("iii. A média de tempo foi: "+media);


	}
}
