package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversao;

public class Convertendo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conversao convert = new Conversao();
		
		System.out.println("Informe a  temperatura em graus celsius ");
		convert.setC(sc.nextDouble());
		
		double conversaok = convert.tempk();
		double conversaof = convert.tempf();
		
		System.out.printf("A temperadura em Kelvin (K) é %.2f ", conversaok);
		System.out.println();
		System.out.printf("A temperadura em Fahrenheit (F) é %.2f: ", conversaof);
		
		

	}

}
