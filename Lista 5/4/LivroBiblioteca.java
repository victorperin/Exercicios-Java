/*******************************************************************************
Exercício 4)
Escreva uma classe Livro que represente os dados básicos de um livro.
• Crie uma classe LivroLivraria que represente os dados básicos de um livro que
    está venda em uma livraria.
• Crie uma classe LivroBiblioteca que represente os dados básicos de um livro
    que pode ser emprestado a leitores.
• Escreva também um programa que demonstre o uso destas classes.
*******************************************************************************/
public class LivroBiblioteca{
  private Livro livro;
  private boolean emprestado;
  private String leitor;
  private Data dataDevolucao;

  public LivroBiblioteca(Livro livro, String leitor){
    this.livro = livro;
    this.leitor = leitor;
    this.emprestado = true;
    Data dataAtual = new Data();
    this.dataDevolucao = new Data((dataAtual.getDia()+7),dataAtual.getMes(),dataAtual.getAno());
  }
}
