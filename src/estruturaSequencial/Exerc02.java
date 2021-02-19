package estruturaSequencial;

import java.util.Scanner;

public class Exerc02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double area, raio;
	
	System.out.println("Digite o valor do raio");
	raio = sc.nextDouble();
	
	area = Math.PI * Math.pow(raio, 2);
	
	System.out.printf("A área da circulo ferencia é %.4f%n",area);
	
	sc.close();
}
}
