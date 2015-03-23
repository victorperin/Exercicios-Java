/*******************************************************************************
Exercício 1)
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se é uma data válida.
b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
c) Usando Delegação, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno deverá existir um atributo Data da Matricula que deverá ser do tipo Data (classe do item a)
e) Na classe Funcionário deverá existir um atributo Data de Admissão que deverá ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.

*******************************************************************************/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Teste{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		List<Aluno> alunos = new ArrayList<Aluno>();  //lista ordenada de aluno
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();  //lista ordenada de funcionarios

		do{
			System.out.print("Digite 1 para cadastrar um aluno e 2 para cadastrar um funcionário (3 para sair): ");
			opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao){
				case 1:
					System.out.print("Digite o nome do Aluno: ");
					String nomeAluno = entrada.nextLine();
					System.out.print("Digite o RG do Aluno: ");
					String rgAluno = entrada.nextLine();
					System.out.print("Digite a data de nascimento do Aluno (string dia/mes/ano): ");
					String dataNascimentoAluno =  entrada.nextLine();
					System.out.print("Digite o RA do Aluno: ");
					String ra = entrada.nextLine();
					System.out.print("Digite a data da matricula do Aluno: ");
					String dataMatricula = entrada.nextLine();

					alunos.add(new Aluno(nomeAluno,rgAluno,dataNascimentoAluno,ra,dataMatricula));

					break;

				case 2:
					System.out.print("Digite o nome do funcionario: ");
					String nomeFuncionario = entrada.nextLine();
					System.out.print("Digite o RG do funcionario: ");
					String rgFuncionario = entrada.nextLine();
					System.out.print("Digite a data de nascimento do Funcionario (string dia/mes/ano): ");
					String dataNascimentoFuncionario = entrada.nextLine();
					System.out.print("Digite o salário do funcionário: ");
					double salario = Double.parseDouble(entrada.nextLine());
					System.out.print("Digite a função do funcionário: ");
					String funcao = entrada.nextLine();

					System.out.print("Digite a data de admissao do funcionário: ");
					String dataAdmissao = entrada.nextLine();

					funcionarios.add(new Funcionario(nomeFuncionario,rgFuncionario,dataNascimentoFuncionario,salario,funcao,dataAdmissao));

					break;
				case 3:
					System.out.print("Saindo...");
					break;
				default: System.out.println("Opção inválida.");
			}
		}while(opcao!=3);
	}
}
