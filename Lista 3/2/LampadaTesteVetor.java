/*******************************************************************************
2. Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTesteVetor
deverá ser criado um vetor para armazenar 30 objetos do tipo Lampada. O programa deverá exibir o seguinte
menu para o usuário:
1 – Cadastrar lâmpada
2 – Exibir todas as lâmpadas
3 – Exibir quantidade de lâmpadas cadastradas
4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
6 – Exibir a quantidade de lâmpadas acesas e apagadas
0 - Sair

*******************************************************************************/
import java.util.Scanner;

public class LampadaTesteVetor{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade_vetor=30,quantidade_lampadas=0,opcoes;
		Lampada[] lampadas = new Lampada[quantidade_vetor];
		do{
      System.out.println("Digite uma das seguntes opções:\n\t1 – Cadastrar lâmpada\n\t2 – Exibir todas as lâmpadas\n\t3 – Exibir quantidade de lâmpadas cadastradas\n\t4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)\n\t5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas\n\t6 – Exibir a quantidade de lâmpadas acesas e apagadas\n\t0 - Sair");
      opcoes = Integer.parseInt(entrada.nextLine());
      switch(opcoes){
				case 1:
					if(quantidade_lampadas>=quantidade_vetor){
						System.out.println("Já existem muitas lâmpadas.");
					}else{
						String tipo, cor, marca;
						int voltagem;
						boolean status;
						double preco, potencia;

						System.out.print("Digite o tipo: ");
						tipo = entrada.nextLine();
						System.out.print("Digite a cor: ");
						cor = entrada.nextLine();
						System.out.print("Digite a marca: ");
						marca = entrada.nextLine();
						System.out.print("Digite a voltagem: ");
						voltagem = Integer.parseInt(entrada.nextLine());
						System.out.print("Digite o preco: ");
						preco = Double.parseDouble(entrada.nextLine());
						System.out.print("Digite a potencia: ");
						potencia = Double.parseDouble(entrada.nextLine());

						lampadas[quantidade_lampadas]= new Lampada(tipo,voltagem,cor,marca,preco,potencia,false);
						quantidade_lampadas++;
					}
					break;
				case 2:
					for(int x=0;x<quantidade_lampadas;x++){
						System.out.println(lampadas[x].toString());
					}
					break;
				case 3:
					System.out.println("Quantidade de lampadas cadastradas: "+quantidade_lampadas);
					break;
				case 4:
					System.out.print("Digite a potencia que você deseja: ");
					double potenciaProcurada = Double.parseDouble(entrada.nextLine());
					int quantidadeEncontrada=0;
					for(int x=0;x<quantidade_lampadas;x++){
						if(lampadas[x].getPotencia() == potenciaProcurada){
							quantidadeEncontrada++;
						}
					}
					System.out.println("Quantidade de lâmpadas com "+potenciaProcurada+" de potencia: "+quantidadeEncontrada);
					break;
				case 5:
					double mediaPreco=0;
					int x;
					for(x=0;x<quantidade_lampadas;x++){
						mediaPreco+=lampadas[x].getPreco();
					}
					mediaPreco=mediaPreco/x;
					for(int y=0;y<quantidade_lampadas;y++){
						double precoAtual = lampadas[y].getPreco();
						if(precoAtual<mediaPreco){
							System.out.println(lampadas[y].toString());
						}
					}
					break;
				case 6:
					int quantidadeAscesas=0,quantidadeApagadas=0;
					for(x=0;x<quantidade_lampadas;x++){
						if(lampadas[x].getStatus()) quantidadeAscesas++;
						else quantidadeApagadas++;
					}
					System.out.println("Quantidade de lâmpadas acesas: "+quantidadeAscesas+"\nQuantidade de lâmpadas apagadas: "+quantidadeApagadas);
					break;
        case 0:
          break;
        default: System.out.println("Você digitou a opção errada, tente novamente.");
      }
    } while(opcoes!=0);
	}
}
