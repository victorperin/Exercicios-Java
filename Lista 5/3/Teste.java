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

public class Teste{
  public static void main(String[] args){
    Pessoa jose = new Pessoa("josé");
    System.out.println(jose.getNome());

    Aluno marcos = new Aluno("marcos","especial",9.5);
    System.out.println(marcos.getNome());
    System.out.println(marcos.getEstatuto());
    System.out.println(marcos.getMedia());

    Empregado joao = new Empregado("João",5000.32);
    System.out.println(joao.getNome());
    System.out.println(joao.getSalario());

    Empregado mario = new Docente("Mario",102312.23,"professor");
    System.out.println(mario.getNome());
    System.out.println(mario.getSalario());
    System.out.println(mario.getTipo());

    Empregado jackinsong = new Discente("jackinsong",300.23,"manutenção");
    System.out.println(jackinsong.getNome());
    System.out.println(jackinsong.getSalario());
    System.out.println(jackinsong.getTipo());
  }
}
