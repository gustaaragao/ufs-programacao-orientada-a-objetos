package pratica01_q01_prova;

public class CorretorAutomatico {
	
	public static void corrigirProva(Prova prova, Gabarito gabarito) {
		
		if (prova.getNumeroQuestoes() == gabarito.getNumeroQuestoes()) {
			
			String nome = prova.getNome();
			double nota = 0.0;
			
			for (int i = 0; i < prova.getNumeroQuestoes(); i++) {
				if (prova.getRespostaQuestao(i) == gabarito.getGabaritoQuestao(i)) {
					nota += gabarito.getValorQuestao(i);
				}
			}
			
			System.out.println("Nome aluno: " + nome);
			System.out.println("Nota: " + nota);
			
			
		} else {
			// TODO: ERRO MESSAGE
		}
		
	}
	
}
