/*******************************************************************************
Exercício 1)
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se é uma data válida.
b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
c) Usando Delegação, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno deverá existir um atributo Data da Matricula que deverá ser do tipo Data (classe do item a)
e) Na classe Funcionário deverá existir um atributo Data de Admissão que deverá ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.

*******************************************************************************/
public class Data{
	private int dia, mes, ano;

	public Data(){}
	public Data(int dia, int mes, int ano){
		if(validarData(dia,mes,ano)){
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
		}
	}

	//getters
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}

	//setters
	public void setDia(int dia){
		this.dia=dia;
	}
	public void setMes(int mes){
		this.mes=mes;
	}
	public void setAno(int ano){
		this.ano=ano;
	}


	//toString
	public String toString(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}

	//converter String para data array
	public int[] converterToArray(String dataString){
		String partes[] = dataString.split("/");
		int[] dataInt = new int[3];
		for(int x=0;x<partes.length;x++){
			dataInt[x]=Integer.parseInt(partes[x]);
		}
		return dataInt;
	}

	//validarData
	public boolean validarData(int dia,int mes,int ano){
		if(ano>0){
			switch(mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia<=31) return true;
					break;
				case 2:
					if(ano%4==0){
						if(dia<=29) return true;
					}
					else{if(dia<=28) return true;}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia<=30) return true;
					break;
				default:
					break;
			}
		}
		return false;
	}

}
