/*******************************************************************************
Exercício 4)
Escreva uma classe Livro que represente os dados básicos de um livro.
• Crie uma classe LivroLivraria que represente os dados básicos de um livro que
    está venda em uma livraria.
• Crie uma classe LivroBiblioteca que represente os dados básicos de um livro
    que pode ser emprestado a leitores.
• Escreva também um programa que demonstre o uso destas classes.
*******************************************************************************/
public class Exercicio{
  public static void main(String[] args){
    Livro eurobo = new Livro("Eu, robô", "Isaac Asimov", "02/12/1950");
    LivroLivraria euroboLivraria = new LivroLivraria(eurobo,45.00f,300);
    LivroBiblioteca euroboBiblioteca = new LivroBiblioteca(eurobo);


    System.out.println("Livro: "+euroboLivraria.getNomeLivro());
    System.out.println("Preço: "+euroboLivraria.getPreco());
    System.out.println("Quantidade de livros em estoque: "+euroboLivraria.getQuantidade());

    System.out.println("Livro: "+euroboBiblioteca.getNomeLivro());
    System.out.println("leitor: "+euroboBiblioteca.getLeitor());
    System.out.println("Data de devolução: "+euroboBiblioteca.getDataDevolucao());
  }
}
