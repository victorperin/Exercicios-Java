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

public class Empregado extends Pessoa{
  protected double salario;
  protected String tipo;

  public Empregado(String nome,double salario){
    super(nome);
    this.salario=salario;
  }

  //getters
  public double getSalario(){
    return this.salario;
  }
  public String getTipo(){
    return this.tipo;
  }

  //setters
  public void setSalario(double salario){
    this.salario=salario;
  }
  protected void setTipo(String tipo){
    this.tipo=tipo;
  }
}
