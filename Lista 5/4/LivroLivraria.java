/*******************************************************************************
Exercício 4)
Escreva uma classe Livro que represente os dados básicos de um livro.
• Crie uma classe LivroLivraria que represente os dados básicos de um livro que
    está venda em uma livraria.
• Crie uma classe LivroBiblioteca que represente os dados básicos de um livro
    que pode ser emprestado a leitores.
• Escreva também um programa que demonstre o uso destas classes.
*******************************************************************************/
public class LivroLivraria{
  private Livro livro;
  private int quantidade;
  private float preco;

  //construtor
  public LivroLivraria(Livro livro, float preco){
    this.livro = livro;
    this.preco = preco;
  }
}
