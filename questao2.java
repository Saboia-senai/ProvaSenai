package prova;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		//DECLARAR O SCANNER
		Scanner ler = new Scanner(System.in);
		
		//PEDIR AO USUARIO O VALOR DA BASE
		
		System.out.println("Informe o valor da base do triangulo");
		double base = ler.nextDouble(); //DECLARAR A BASE
		
		//PEDIR AO USUARIO O VALOR DA ALTURA
		
		System.out.println("Informe o valor da altura do triangulo");
		double altura = ler.nextDouble(); //DECLARAR A ALTURA
		
		//MULTIPLICAR A BASE PELA ALTURA PARA OBTER O RESULTADO DA AREA
		
		double area = base * altura/2; //DECLARAR A AREA COM O RESULTADO DA CONTA
		
		//MOSTRAR O RESULTADO DA AREA DO TRIANGULO AO USUARIO
		System.out.println("A area do triangulo é: " + area);

		//FECHAR O SCANNER
		ler.close();
	}

}
