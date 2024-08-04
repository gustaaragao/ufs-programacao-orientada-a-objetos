package pratica01_q01_prova;

public class Gabarito {

	private int numeroQuestoes;
	private char[] gabaritoQuestoes;
	private double[] valorQuestoes;

	public Gabarito(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
		this.gabaritoQuestoes = new char[numeroQuestoes];
		this.valorQuestoes = new double[numeroQuestoes];
	}

	public char[] getGabaritoQuestoes() {
		return gabaritoQuestoes;
	}

	public char getGabaritoQuestao(int numeroQuestao) {
		return this.gabaritoQuestoes[numeroQuestao];
	}

	public void setGabaritoQuestoes(char[] gabaritoQuestoes) {
		this.gabaritoQuestoes = gabaritoQuestoes;
	}

	public int getNumeroQuestoes() {
		return numeroQuestoes;
	}

	public double[] getValorQuestoes() {
		return valorQuestoes;
	}

	public double getValorQuestao(int numeroQuestao) {
		return this.valorQuestoes[numeroQuestao];
	}

	public void setValorQuestoes(double[] valorQuestoes) {
		this.valorQuestoes = valorQuestoes;
	}

}
