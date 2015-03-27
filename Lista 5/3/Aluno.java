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

public class Aluno extends Pessoa{
  private String estatuto;
  private double media;

  public Aluno(String nome,String estatuto,double media){
    super(nome);
    this.estatuto=estatuto;
    this.media=media;
  }

  //getters
  public String getEstatuto(){
    return this.estatuto;
  }
  public double getMedia(){
    return this.media;
  }

  //setters
  public void setEstatuto(String estatuto){
    this.estatuto=estatuto;
  }
  public void setMedia(double media){
    this.media=media;
  }
}
