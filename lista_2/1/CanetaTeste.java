/*******************************************************************************
* 1) Implementar uma classe Caneta que deve possuir como características marca,
*	cor e tamanho. Nesta classe devem ser implementados os métodos construtores,
*	getters, setters e toString. Em uma outra classe chamada CanetaTeste deverá
*	ser criado um objeto do tipo Caneta, atribuir valores e exibir os dados
*	deste objeto.
*******************************************************************************/


import java.util.Scanner;
import Caneta;

public class CanetaTeste {

    public static void main(String[] args) {
        Caneta bic = new Caneta();
        bic.setMarca("bic");
        bic.setCor("azul");
        bic.setTamanho("10cm");
        
        System.out.println("Tamanho: "+bic.getTamanho());
        System.out.println("Cor: "+bic.getCor());
        System.out.println("Marca: "+bic.getMarca());
    }
    
}