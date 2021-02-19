package estruturaSequencial;

import java.util.Scanner;

public class Exerc06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double A,B, C, triangulo, circulo, trapezzio, quadrado, retangulo;
	

	System.out.println("Digite o valor de A");
	A = sc.nextDouble();
	
	System.out.println("Digite o valor de B");
	B = sc.nextDouble();
	
	System.out.println("Digite o valor de C");
	C = sc.nextDouble();
	
	
	triangulo = A * C/2;
	
	circulo = Math.PI *  C*C;
	
	trapezzio = (A + B) / 2 * C;
	
	quadrado = B*B;
	
	retangulo = A*B;
	
	System.out.printf(" O triangulo é: %.3f%n ",triangulo);
	System.out.printf(" O circulo é: %.3f%n ",circulo);
	System.out.printf(" O trapezio é: %.3f%n ",trapezzio);
	System.out.printf(" O quadrado é: %.3f%n ",quadrado);
	System.out.printf(" O retangulo é: %.3f%n ",retangulo);
	
	sc.close();
}
}
