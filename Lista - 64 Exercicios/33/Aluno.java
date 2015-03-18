public class Aluno { //usando um array de objetos para que não seja necessário especificar 2 arrays diferentes.
	private String NumeroMatricula;
	private double NotaProva;

	public void setAluno(String NumeroMatricula,double NotaProva){
		this.NumeroMatricula = NumeroMatricula;
		this.NotaProva = NotaProva;
	}

	public double getNotaProva() {
		return NotaProva;
	}

}
