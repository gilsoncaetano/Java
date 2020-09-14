package poo;

import java.util.Random;

/**
 * @author Gilson Caetano
 * Atividade de Construção de objeto
 *  Abstraçăo
 */

public class Carro {
	
	int ano;
	String cor;
	  
	public Carro () {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: "+ chassi);
	}
	
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
		System.out.println("     	   __________");	
		System.out.println("          //    /    \\");
	    System.out.println(" ________//____/______\\____");
	    System.out.println(" [0[\\\\[0[____   | -  ______| ");
	    System.out.println(" \\_____|/, \\_|____|/,  \\/_/");
	    System.out.println("  \\\\_ \\\\__//______\\\\__/");
	    System.out.println("__________________________________");
	}
	
	
	void ligar() {
		System.out.println("engine ON . . . . .");
	}
	void desligar() {
		System.out.println("engine OFF . . . . .");
	}
	void acelerar() {
		System.out.println("vrummmmmm");
	}
}
