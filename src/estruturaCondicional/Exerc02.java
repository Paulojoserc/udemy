package estruturaCondicional;

import java.util.Scanner;

public class Exerc02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.println("Digite o n�mero");
	num = sc.nextInt();
	
	if (num % 2 == 0) {
		System.out.println("� par");
	}else {
		System.out.println("� impar");
	}
	
	
	sc.close();
}
}
