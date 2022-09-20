package aplication;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		String nome;
		double nota1, nota2, nota3, cargaHoraria, horasFaltadas;
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Informe a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = sc.nextDouble();
		System.out.println("Informe a nota 3: ");
		nota3 = sc.nextDouble();
		System.out.println("Informe a carga Horaria do curso: ");
		cargaHoraria = sc.nextDouble();
		System.out.println("Quantas horas faltou o Aluno: ");
		horasFaltadas = sc.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		double falta = (horasFaltadas / cargaHoraria) * 100;
		
		
		System.out.println("O aluno esta: ");
		
		if(media >= 7 && falta <= 15 ) {
			System.out.println("PASSED");
		}else {
			System.out.println("NO PASS!");
		}
		
	}

}
