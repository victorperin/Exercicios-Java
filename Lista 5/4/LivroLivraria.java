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

  //construtores
  public LivroLivraria(Livro livro, float preco){
    this.livro = livro;
    if(preco>=0.0f) this.preco = preco;
  }
  public LivroLivraria(Livro livro, float preco,int quantidade){
    this.livro = livro;
    if(preco>=0.0f) this.preco = preco;
    this.quantidade = quantidade;
  }

  //getters
  public String getNomeLivro(){
    return this.livro.getNome();
  }
  public String getAutorLivro(){
    return this.livro.getAutor();
  }
  public String getDataLancamentoLivro(){
    return this.livro.getDataLancamento();
  }
  public float getPreco(){
    return this.preco;
  }
  public int getQuantidade(){
    return this.quantidade;
  }

  //setters
  public void setPreco(float novoPreco){
    if(novoPreco>=0.0f) this.preco = novoPreco;
  }
}
