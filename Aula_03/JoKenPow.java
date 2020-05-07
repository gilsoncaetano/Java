package Exercícios;

import java.util.Scanner;

/**
 * @author Gilson Caetano
 * Atividade do Jogo JoKenPow
 * Trabalhando com IF Else IF Else.
 *
 */
public class JoKenPow {

	public static void main(String[] args) {
		// Elementos que serão apresentado
		int jogador;
		Scanner jogo = new Scanner(System.in);
		System.out.println("");
		// Entrada dos elementos
		System.out.println("___G___JoKenPow____C__");
		System.out.println("");
		System.out.println("1. Papel");
		System.out.println("2. Tesoura");
		System.out.println("3. Pedra");
		System.out.println("Escolha  Seu Jogo: ");
		// Procesamento do resultado do jogador	
		jogador = jogo.nextInt();
		System.out.println("");
		if (jogador == 1) {
			System.out.println("Jogador escolhel PAPEL");			
		} else if (jogador == 2) {
			System.out.println("Jogador escolhel TESOURA");
		} else if (jogador == 3) {
			System.out.println("Jogador escolhel PEDRA");
		} else {
			System.out.println("VOCÊ IDGITOU A OPÇÂO INVALIDA ");
		}
		jogo.close();
		
		// entrada dos elementos para escolha da Maquina
		System.out.println("______________________________");
		int Maquina;
		Maquina = (int) (Math.random() * 3 + 1);
		if (Maquina == 1) {
			System.out.println("Maquina escolhel PAPEL");			
		} else if (Maquina == 2) {
			System.out.println("Maquina escolhel TESOURA");
		} else if (Maquina == 3) {
			System.out.println("Maquina escolhel PEDRA");
		} else {
			System.out.println("VOCÊ IDGITOU A OPÇÂO INVALIDA ");
		}
		System.out.println("______________________________");
		// Saida dos resultados do jogo final
		if (Maquina != jogador) {
		 if ((Maquina==1 && jogador==3)||(Maquina == 2 && jogador==1)||(Maquina==3 && jogador==2)) {
			System.out.println("MAQUINA VENCEU.");
			
			} else 
			System.out.println("JOGADOR VENCEU.");			
	  	    } else {
			System.out.println("JOGO DEU EMPATE. ");		  
		
	  }
   }
}
