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
	public Data(String dataString){
		int[] dataInt = converterToArray(dataString);
		if(validarData(dataString)){
			this.dia=dataInt[0];
			this.mes=dataInt[1];
			this.ano=dataInt[2];
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
	public void setData(String dataString){
		int[] data = converterToArray(dataString);
		this.dia=data[0];
		this.mes=data[1];
		this.ano=data[2];
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
	public boolean validarData(String dataString){
		Date c = Calendar.getInstance().getTime();
        	SimpleDateFormat df = new SimpleDateFormat("yyyy");
        	int[] data = converterToArray(dataString);
        	if(data[2] > 0 && data[2] <= Integer.parseInt(df.format(c))){//ano
			switch(data[1]){ //mes
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(data[0]<=31) return true;//dia
					break;
				case 2:
					if(data[2]%4==0){//ano
						if(data[0]<=29) return true;//dia
					}
					else{if(data[0]<=28) return true;}//dia
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(data[0]<=30) return true;//dia
					break;
				default:
					break;
			}
		}
		return false;
	}

}
