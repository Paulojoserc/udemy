package estruturaCondicional;

import java.util.Scanner;

public class Exerc05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cod;
	double quant, valor=0;
	
	System.out.println("Digite a opção que você deseja"
			+ "1 para Cachorro quente"
			+ "2 para X-Salada"
			+ "3 para X-Bacon"
			+ "4 para Torrada simples"
			+ "5 Refrigerante");
	cod =sc.nextInt();
	System.out.println("Quantos vai querer");
	quant = sc.nextDouble();
	if (cod == 1) {
		valor = quant * 4.00;
	}else if (cod == 2) {
		valor = quant * 4.50;
	}else if (cod == 3) {
		valor = quant * 5.00;
	}else if (cod == 4) {
		valor = quant * 2.00;
	}else if (cod == 5) {
		valor = quant * 1.50;
	}else {
		System.out.println("Opção invaida");
	}
	
	System.out.printf("O valor a pagar é %.2f%n",valor);
	
	sc.close();
}
}
