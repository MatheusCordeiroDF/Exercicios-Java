package Apllication;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		
		
		System.out.println("Qual a massa inicial: " );
		double massaInicial = sc.nextDouble();
	
		
		
		int contador = 0;
		while (massaInicial > 0.5) {
			massaInicial = massaInicial / 2;
			contador++;
	}
		
		int segundos = contador * 50;
		
		System.out.println("Segundos "+ segundos);
		
		int horas = segundos / 3600;
		segundos %= 3600;
		int minutos = segundos / 60;
		segundos %= 60;
		
		System.out.print("Tempo total:");
		System.out.printf(" %d horas", horas);
		System.out.printf(" %d minutos", minutos);
		System.out.printf(" %d segundos", segundos);

}
}
