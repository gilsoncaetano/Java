package Curso_Java;

/**
 * @author Gilson Caetano
 *  Hello World
 */

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 26;
		char sexo = 'M';
		double temperatura = 27.7;
		boolean arCondicionado = false;
		nome = "Gilson Rufino Caetano";
		System.out.println("Uso de variáveis na linguagem Java");
		System.out.println("Exemplos:");
		System.out.println("nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("___________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritméticos e Atribuição");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("ESTRUTURA DE CONTROLR");
		System.out.println("");
		System.out.println("Estrtuaras de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do if");
		if (sexo == 'M') {
			System.out.println("Alistamento Militar obrigatorio");
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else' ");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'if - else' ");
		idade = 10;
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		}	else if (idade >= 18 && idade <=70) {
				System.out.println("VOTO OBRIGATORIO");
			} else if(idade ==16 || idade == 17 || idade == 70) {
				System.out.println("VOTO FACULTATIVO");
			}
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do 'switch case' ");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Relatórios");
		int opcao = 3;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÀRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		
		}
		System.out.println("");
		System.out.println("Estruturas de repetições");
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'for'");
		for (int j =10; j > 0; j --) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 6 - Tabuaada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			
			}
			
		}
		System.out.println("");
		System.out.println("Exemplo 7 - Usa da estrutura while");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Usa da estrutura 'do while' ");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(n/s)?" );
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GEME OVER");
	}
		
}