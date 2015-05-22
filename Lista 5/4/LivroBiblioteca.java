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

  public LivroBiblioteca(Livro livro){
    this.livro = livro;
    this.emprestado = false;
  }
  public LivroBiblioteca(Livro livro, String leitor){
    this.livro = livro;
    this.leitor = leitor;
    this.emprestado = true;
    Data dataAtual = new Data();
    this.dataDevolucao = new Data((dataAtual.getDia()+7),dataAtual.getMes(),dataAtual.getAno());
  }
  public LivroBiblioteca(Livro livro, String leitor,String dataDevolucao){
    this.livro = livro;
    this.leitor = leitor;
    this.emprestado = true;
    this.dataDevolucao = new Data(dataDevolucao);
  }

  //getters
  public String getNomeLivro(){
    return livro.getNome();
  }
  public String getAutorLivro(){
    return livro.getAutor();
  }
  public String getDataLancamentoLivro(){
    return livro.getDataLancamento();
  }
  public String getResumoLivro(){
    return livro.getResumo();
  }
  public boolean getSeFoiEmprestado(){
    return this.emprestado;
  }
  public String getLeitor(){
    if(this.emprestado) return this.leitor;
    else return "O livro não foi emprestado";
  }
  public String getDataDevolucao(){
    if(this.emprestado) return dataDevolucao.toString();
    else return "O livro não foi emprestado";
  }

  //setters
  public void devolver(){
    this.emprestado = false;
    this.leitor = "";
  }
  public void alugar(String nome){
    this.emprestado = true;
    this.leitor = nome;
    Data dataAtual = new Data();
    this.dataDevolucao = new Data((dataAtual.getDia()+7),dataAtual.getMes(),dataAtual.getAno());
  }
  public void trocarLeitor(String nome){
    this.leitor = nome;
  }
  public void aumentarPrazoDevolucao(){
    Data novaData = new Data((this.dataDevolucao.getDia()+7),this.dataDevolucao.getMes(),this.dataDevolucao.getAno());
    this.dataDevolucao = novaData;
  }
}
