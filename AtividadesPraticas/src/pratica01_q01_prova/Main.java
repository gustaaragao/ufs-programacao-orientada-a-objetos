package pratica01_q01_prova;

public class Main {

	public static void main(String[] args) {
		Gabarito gabarito = new Gabarito(5);

		gabarito.setGabaritoQuestoes(new char[] { 'A', 'B', 'C', 'D', 'E' });

		gabarito.setValorQuestoes(new double[] { 1.0, 1.0, 4.0, 2.5, 1.5 });

		Prova provaGustavo = new Prova("Gustavo", 5);

		provaGustavo.setRespostasQuestoes(new char[] { 'A', 'B', 'C', 'D', 'E' });

		Prova provaHenrique = new Prova("Henrique", 5);

		provaHenrique.setRespostasQuestoes(new char[] { 'E', 'D', 'C', 'D', 'E' });

		CorretorAutomatico.corrigirProva(provaGustavo, gabarito);

		CorretorAutomatico.corrigirProva(provaHenrique, gabarito);

	}

}
