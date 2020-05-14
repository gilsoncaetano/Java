package poo;

/**
 * @author Gilson Caetano
 * Atividade de Construção de objeto
 *  Abstraçăo
 */


public class Camaro {

	public static void main(String[] args) {
		Carro camaro = new Carro();
		camaro.ano = 2012;
		camaro.cor = "Amarelo";
		System.out.println("Carro: camaro");
		System.out.println("Ano:" + camaro.ano);
		System.out.println("cor:" + camaro.cor);
		camaro.ligar();
		camaro.acelerar();


	}

}
