/*******************************************************************************
Exercício 3)
Uma universidade deseja modificar a estrutura de sua base de dados. Para isso, ela quer construir a
hierarquia das pessoas que frequentam o estabelecimento com a ajuda de uma representação do tipo
OO (orientado objeto). A universidade deseja conservar o nome de todas as pessoas e dispõe de
uma função que lhe permite de inicializar e de modificar este membro dado. A universidade é
frequentada por estudantes e empregados. As fichas dos estudantes devem conter seu nome, seu
estatuto (aluno especial, tempo parcial, tempo integral) e sua média. Além do mais, é necessário
prever funções que poderão modificar o estatuto e a média. Os empregados são divididos em duas
categorias: o corpo docente (demonstrador, monitor, professor) e o discente (escritório e
manutenção). Para todos os empregados, nós devemos prever um campo salário e uma função que
permita fixar os salários. Escreva, em linguagem JAVA, as declarações das classes que permitem
representar esta hierarquia.
*******************************************************************************/

public class Docente extends Empregado{

  public Docente(String nome,double salario,String tipo){
    super(nome,salario);
    setTipo(tipo);
  }

  //setters
  public void setTipoDocente(String tipo){
    switch(tipo){
      case "demonstrador":
      case "monitor":
      case "professor":
        setTipo(tipo);
        break;
      default:
        System.out.println("Atenção, tipo de docente errado.");
    }
  }
}
