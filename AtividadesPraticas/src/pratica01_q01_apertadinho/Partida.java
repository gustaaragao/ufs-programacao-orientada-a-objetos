package pratica01_q01_apertadinho;

import java.util.Scanner;

public class Partida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Apertadinho apertadinho = new Apertadinho(0, 100);

		System.out.println("BEM-VINDO AO JOGO APERTADINHO!!");

		while (true) {
			int palpite;

			System.out.println("Qual o seu palpite? ");

			palpite = sc.nextInt();
			
			if (apertadinho.adivinhar(palpite)) {
				break;
			}
		}
		
		sc.close();
		
		System.out.println("Fim do Jogo!!");
	}

}
