package estruturaCondicional;

import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num;
		
		System.out.println("Digite o valor desejado ");
		num = sc.nextDouble();
		
		if (num>= 0 && num <= 25) {
			System.out.println("O intervalo é [0,25]");
		}else if(num >25 && num <= 50) {
			System.out.println("O intervalo é [25,50]");
		}else if (num  >50 && num <= 75) {
			System.out.println("O intervalo é [50, 75]");
		}else if ( num > 75 && num <=100) {
			System.out.println("O intervalo é 75, 100");
		}else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}
}
