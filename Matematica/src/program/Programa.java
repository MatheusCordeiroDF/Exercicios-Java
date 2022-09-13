package program;

import java.util.Locale;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		
		System.out.println("Informe o nome do Aluno");
		aluno.setAluno(sc.nextLine());
		System.out.println("Informe a primeiro nota do aluno:");
		aluno.setNota1(sc.nextFloat());
		System.out.println("Informe a segunda nota do aluno:");
		aluno.setNota2(sc.nextFloat());
		System.out.println("Informe a terceira nota do aluno:");
		aluno.setNota3(sc.nextFloat());
		System.out.println("Informe a quarta nota do aluno:");
		aluno.setNota4(sc.nextFloat());
		
		
		System.out.print( aluno);
		
		
		
		

	}

}
