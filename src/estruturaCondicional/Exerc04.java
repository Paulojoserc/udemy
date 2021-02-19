package estruturaCondicional;

import java.util.Scanner;

public class Exerc04 {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	
	int duracao, dia= 24, horaI, horaF;
	
	System.out.println("Digite a hora de inicio do jogo");
	horaI = sc.nextInt();
	
	System.out.println("Digite a hora do fim do jogo");
	horaF = sc.nextInt();
	
	
	duracao = dia - horaI + horaF;
	
	if (duracao> 24 ) {
		
		duracao = duracao - 24;
		System.out.println(" O jogo durou :"+duracao +" Hora(s)");
	}else {
	
		System.out.println(" O jogo durou :"+duracao +" Hora(s)");
	}
	
	
	
	
	
	sc.close();
}
}
