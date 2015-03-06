public class Operario{
  private int id;
  private double QuantidadeHora,QuantidadeExcedente,PrecoHora,PrecoExcedente;

  public void Operario(int id, double PrecoHora){
    this.id = id;
    this.PrecoHora = PrecoHora;
    this.PrecoExcedente = PrecoHora*2;
    this.QuantidadeHora=0;
    this.QuantidadeExcedente=0;
  }

  public void addHoras(double Quantidade){
    this.QuantidadeHora += Quantidade;
    verifyExcedente();
  }

  public void verifyExcedente(){
    if(this.QuantidadeHora>50){
      this.QuantidadeExcedente=QuantidadeHora-50;
    }
  }


}
