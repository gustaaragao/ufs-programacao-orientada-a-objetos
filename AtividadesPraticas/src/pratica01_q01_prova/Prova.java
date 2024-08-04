package pratica01_q01_prova;

public class Prova {

	private String nome;
	private int numeroQuestoes;
	private char[] respostasQuestoes;
	

	public Prova(String nome, int numeroQuestoes) {
		this.nome = nome;
		this.numeroQuestoes = numeroQuestoes;
		this.respostasQuestoes = new char[numeroQuestoes];
	}

	public char[] getRespostasQuestoes() {
		return respostasQuestoes;
	}
	
	public char getRespostaQuestao(int numeroQuestao) {
		return this.respostasQuestoes[numeroQuestao];
	}
	
	public void setRespostasQuestoes(char[] respostasQuestoes) {
		this.respostasQuestoes = respostasQuestoes;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroQuestoes() {
		return numeroQuestoes;
	}

}
