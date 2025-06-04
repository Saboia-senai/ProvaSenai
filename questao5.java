package prova;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
	    //DECLARAR O SCANNER
		Scanner ler = new Scanner(System.in);
		
		//CRIAR AS DUAS LISTAS, UMA COM NOME E OUTRA COM AS IDADES
		String[] nomes = new String [8];
		int[] idades = new int [8];
		
		//PEDIR O NOME DE CADA PESSOA EM ORDEM, ATE CHEGAR NA 8ª
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "ª pessoa: ");
			nomes[i] = ler.next();
			
			//MOSTRAR O NOME DA PESSOA E PERGUNTAR A IDADE
			System.out.println("Digite a idade de " + nomes[i] + ": ");
			idades[i] = ler.nextInt();
		}
		
		//MOSTRAR O NOME E A IDADE DAS PESSOAS MAIORES DE IDADE
		System.out.println("Pessoas maiores de idade :");
		for (int i = 0; i < 8; i++) {
			if (idades[i] >= 18) {
				System.out.println(nomes[i] + " tem " + idades[i] + "anos.");
			}
			
		}

		//FECHAR O SCANNER
		ler.close();
	}

}
