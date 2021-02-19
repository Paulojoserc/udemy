package estruturaSequencial;

import java.util.Scanner;

public class Exerc03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a, b, c,d ,soma;
	
	System.out.println("Digite o valor de A");
	a = sc.nextInt();
	
	System.out.println("Digite o valor de B");
	b = sc.nextInt();
	
	System.out.println("Digite o valor de C");
	c = sc.nextInt();
	
	System.out.println("Digite o valor de D");
	d = sc.nextInt();
	
	soma = (a*b - c*d);
	
	System.out.println("O resultado da operação é: "+soma);
	
	
	sc.close();
}
}
