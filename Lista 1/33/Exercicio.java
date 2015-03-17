/*******************************************************************************
* 33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma
* turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno
* são: número de matrícula e a sua nota na prova em questão.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int QuantidadeAlunos;
		String matricula;
		double mediaAlunos=0;

		System.out.print("Digite um a quantidade de alunos: ");
		QuantidadeAlunos = entrada.nextInt();

		Aluno[] alunos = new Aluno[QuantidadeAlunos];

		for(int x = 0;x < QuantidadeAlunos;x++){
			System.out.print("\nDigite o número da matrícula do aluno: ");
			matricula = entrada.next();
			System.out.print("Digite a nota do aluno: ");
			double nota = entrada.nextDouble();
			alunos[x] = new Aluno();
			alunos[x].setAluno(matricula,nota);
			mediaAlunos += nota;
		}
		mediaAlunos = mediaAlunos/QuantidadeAlunos;
		System.out.println("\nA média da turma foi de "+mediaAlunos);
	}
}
