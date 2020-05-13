

package Exercícios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Gilson Caetano
 *Indice de Massa Corporal IMC 
 */

public class IMC {


	public static void main(String[] args) {
		int idade;
		double idade, peso, altura, imc;
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Cálculo do IMC do paciente");
		
		// Entrada 
		
		System.out.print("Digite a sua Idade: ");
		idade = (int) leitor.nextDouble();		
		System.out.print("Digite o seu Peso: ");
		peso = leitor.nextDouble();
		System.out.print("Digite a sua Altura: ");
		altura = leitor.nextDouble();
		// prosenamento
	
		imc = peso / (altura * altura);
		//Saida
		System.out.println("___________________________________");
		System.out.println("Seu IMC é: " + formatador.format(imc));	
		System.out.println("___________________________________");
		System.out.println("Idade: " + formatador.format(idade));
		System.out.println("___________________________________");
		System.out.println("Peso: " + formatador.format(peso));
		System.out.println("___________________________________");
		System.out.println("Altura: " + formatador.format(altura));
		System.out.println("___________________________________");
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
			
		} else if (imc > 18.5 && imc <= 24.9) {
			System.out.println("Seu Peso Esta Normal.");
			
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você esta acima do Pesso.");
			
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Você Esta Obesidade grau 1.");
			
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Você Esta Obesidade grau 2.");
			
		} else {
			System.out.println("Você Esta Obesidade grau 3");
			leitor.close();
			
		}
	}
}


