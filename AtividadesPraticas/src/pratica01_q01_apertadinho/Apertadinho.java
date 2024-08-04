package pratica01_q01_apertadinho;

public class Apertadinho {

	private int inicioIntervalo;
	private int fimIntervalo;
	private int numeroSecreto;

	/**
	 * 
	 * @param inicioIntervalo
	 * @param fimIntervalo
	 */
	public Apertadinho(int inicioIntervalo, int fimIntervalo) {

		// TODO : FAZER VERIFICAÇÃO DO INICIO DO INTERVALO E FIM DO INTERVALO

		this.inicioIntervalo = inicioIntervalo;

		this.fimIntervalo = fimIntervalo;

		this.numeroSecreto = (int) ((fimIntervalo - inicioIntervalo + 1) * Math.random()) + inicioIntervalo;
	}

	/**
	 * @param palpite
	 * @return
	 */
	public boolean adivinhar(int palpite) {
		if (palpite == this.numeroSecreto) {
			System.out.println("Parabennss!! Voce acertou :D");
			return true;
		} else {
			System.out.println("Que pena... Seu palpite nao foi dos melhores :(");
			
			if (this.numeroSecreto > palpite) {
				this.inicioIntervalo = palpite;
			} else {
				this.fimIntervalo = palpite;
			}
			
			System.out.printf("O novo intervalo agora eh [%d, %d]\n", this.inicioIntervalo, this.fimIntervalo);
			return false;
		}
	}
}
