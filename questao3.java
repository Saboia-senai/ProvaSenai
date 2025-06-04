package prova;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		//DECLARAR O SCANNER
		Scanner ler = new Scanner(System.in);
		
		//PEDIR AO USUARIO UM NUMERO DE 1 ATÉ 7
		
		System.out.println("Digite um número de 1 a 7");
		int dia = ler.nextInt(); //DECLARAR A VARIAVEL DIA
		
		//MOSTRAR PARA CADA NUMERO DIGITADO, UM DIA DA SEMANA USANDO O SWITCH CASE
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default: 
			System.out.println("numero invalido"); //CASO O NUMERO DIGITADO SEJA 0 OU MAIOR QUE 7, MOSTRAR NUMERO INVALIDO
			
		}
		
		//FECHAR O SCANNER
		ler.close();
	}

}
