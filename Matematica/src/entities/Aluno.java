package entities;

public class Aluno {
private String aluno;
private double nota1;
private double nota2;
private double nota3;
private double nota4;

	
	
	public double getNota1() {
	return nota1;
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public double getNota2() {
	return nota2;
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}
public double getNota3() {
	return nota3;
}
public void setNota3(double nota3) {
	this.nota3 = nota3;
}
public double getNota4() {
	return nota4;
}
public void setNota4(double nota4) {
	this.nota4 = nota4;
}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	
	
	
	public double media(){
		return (nota1 + nota2 + nota3 + nota4) /4;
	}
	
	public String toString() {
		return "A media do aluno " + aluno
				+ String.format(" � %.2f", media());
	}
	
}
