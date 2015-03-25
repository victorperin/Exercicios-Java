/*******************************************************************************
veja a imagem anexa na mesma pasta
*******************************************************************************/

public class ContaBancariaSimplificada{
  private String nomeDoCorretista;
  private double saldo;
  private boolean contaEspecial;

  public ContaBancariaSimplificada(){}
  public void AbreConta(String nome,double saldo,boolean especial){
    this.nomeDoCorretista=nome;
    this.saldo=saldo;
    this.contaEspecial=especial;
  }
  public void AbreContaSimples(String nome){
    this.nomeDoCorretista=nome;
    this.saldo= 0;
    this.contaEspecial=false;
  }
  public void Deposita(double valor){
    this.saldo += valor;
  }
  public void Retira(double valor){
    this.saldo -= valor;
  }

  public void MostraDados(){
    String especial;
    if(contaEspecial==true){especial="sim";}
    else{especial="não";}
    System.out.println("Conta:\n\tNome do Corretista: "+this.nomeDoCorretista+"\n\tSaldo: "+this.saldo+"\n\tConta Especial? "+especial);
  }
}
