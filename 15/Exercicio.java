/*******************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e
* apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
* for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
* do recuperação, somar com o valor da média e obter a nova média. Se a nova
* média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
* foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
* mensagem informando esta condição. Apresentar junto com as mensagens o valor
* da média do aluno.
*******************************************************************************/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PrimeiraNota, SegundaNota, TerceiraNota, QuartaNota, RecuperacaoNota, Media;
        boolean Aprovacao = false;

      	System.out.print("Verificador de notas\n\n");


        System.out.print("Digite a primeira nota:  ");
        PrimeiraNota = entrada.nextDouble();

        System.out.print("Digite a segunda nota:  ");
        SegundaNota = entrada.nextDouble();

        System.out.print("Digite a terceira nota:  ");
        TerceiraNota = entrada.nextDouble();

        System.out.print("Digite a quarta nota:  ");
        QuartaNota = entrada.nextDouble();


        Media = (PrimeiraNota + SegundaNota + TerceiraNota + QuartaNota)/4;

        if(Media >= 7) Aprovacao = true;
        else{
          System.out.print("O aluno ficou de recuperação, digite a nota: ");
          RecuperacaoNota = entrada.nextDouble();
          Media = (Media + RecuperacaoNota)/2;
          if(Media >= 7) Aprovacao = true;
        }

        if(Aprovacao == true){
          System.out.println("\n\nO Aluno foi aprovado com a média "+Media);
        }else{
          System.out.println("\n\nO Aluno foi reprovado com a média "+Media);
        }

    }

}
