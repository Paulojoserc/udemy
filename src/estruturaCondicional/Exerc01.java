package estruturaCondicional;

import java.util.Scanner;

public class Exerc01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.println("Digite o n�mero");
	num = sc.nextInt();
	
	if (num >=0) {
		System.out.println("� positivo");
	}else {
		System.out.println("� negativo");
	}
	
	
	sc.close();
}
}
