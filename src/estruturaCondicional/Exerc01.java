package estruturaCondicional;

import java.util.Scanner;

public class Exerc01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.println("Digite o número");
	num = sc.nextInt();
	
	if (num >=0) {
		System.out.println("É positivo");
	}else {
		System.out.println("É negativo");
	}
	
	
	sc.close();
}
}
