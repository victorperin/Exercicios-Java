/*******************************************************************************
Exercício 5)
Escreva uma classe VeiculoAVenda que represente informações básicas sobre um veículo genérico que esteja à venda, como tipo (podendo ser representado por uma String), ano e precoDeVenda.
• Escreva uma classe AutomovelAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor constante "Automóvel",
• Escreva uma classe MotocicletaAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor "Motocicleta".
• Escreva também um programa que demonstre o uso destas classes usando Polimorfismo.
*******************************************************************************/
import java.util.ArrayList;

public class Exercicio{
  public static void main(String[]args){

    ArrayList<VeiculoAVenda> veiculos = new ArrayList<VeiculoAVenda>();
    veiculos.add(new AutomovelAVenda("fusca",1970,10000.00f));
    veiculos.add(new MotocicletaAVenda("Alguma moto conhecida, porque eu não conheço nenhuma...",2012,7023.05f));

    for(int x=0; x<veiculos.size();x++){
      System.out.println(veiculos.get(x).toString());
    }


  }
}
