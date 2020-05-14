package Exercícios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Gilson Caetano
 * Ativida Simulando de Posto de combustivel
 * com Gasolina, Alco e Disel na Bomba 
 * valor do Combustivel, Valor que sera Abastecido e Quantidade de litro
 * que foi Abastecido no Veiculo.
 *
 */
public class Tema_Livre_Bomba_Combustivel {

	public static void main(String[] args) {
		//  * Ativida Simulando de Posto de combustivel
		// com Gasolina, Alco e Disel na Bomba 
		// valor do Combustivel, Valor que sera Abastecido e Quantidade de litro
	    // que foi Abastecido no Veiculo.
		int combustivel;
		double preco, litro, total;
		//double gasolina, etanol, disel, litro1;
		Scanner real = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		//objeto formatador (usado para formatar o resultado)
		
		System.out.println("");
		System.out.println("______Bomba De Combustivel______");
		System.out.println("");
		System.out.println(" 2. Gasolina");
		//gasolina = real.nextInt ();
		System.out.println(" 4. Etanol");
		//etanol = real.nextInt ();
		System.out.println(" 6. Disel");
		//disel = real.nextInt ();
		System.out.println(" Escolha O Combustivel: ");
		combustivel= real.nextInt ();
		
			
		// Logica da Bomba de combustivel
		switch (combustivel) {
		case 2:
			System.out.println(" GASOLINA");
			break;
		case 4:
			System.out.println(" ETANOL");
			break;
		case 6:
			System.out.println(" DISEL");
			break;
		default:
			System.out.println(" OPÇÂO INVALIDA");
			break;
			
		}

		if (combustivel == 2) {
		System.out.println(" VALOR R$ 3,67");
	    } else if (combustivel == 4) {
		System.out.println(" VALOR R$ 2,19");
	    } else if (combustivel == 6) {
		System.out.println(" VALOR R$ 2,87");
	    }else {
	    	System.out.println(" VALOR INVALIDA");
	    }
	    
		System.out.println("___________________________");
		System.out.println("");
		// Processamento de valor
		//int Valor = 2;
		System.out.println(" Confirma o Valor do Combustivel");
		preco = real.nextDouble();
		System.out.print(" Digite o Valor do Abastecimento: ");
		total = real.nextDouble();
		
		
		litro = total / preco;	
		System.out.println("____________________________");
		System.out.println("");
		System.out.println(" VALOR TOTAL: " + formatador.format(total));
		System.out.println("____________________________");
		System.out.println(" VALOR do Combustivel: " + formatador.format(preco));
		System.out.println("____________________________");
		System.out.println(" TOTAL DE LITRO ABASTECIDO: " + formatador.format(litro));
		
		real.close();
	
		
		
	}
	                                

}
