package desafio2;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		
		String nome;
		double preco;
		int quantidade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		nome = sc.nextLine();
		System.out.println("Informe o valor do produto: ");
		preco = sc.nextDouble();
		System.out.println("Informe a quantidade a ser comprada: ");
		quantidade = sc.nextInt();
		
		
		if(quantidade <= 10) {
			double valortotal = quantidade * preco;
			System.out.printf("Valor total a ser pago: %.2f", valortotal);
		} else if(quantidade <= 20) {
			double porcetagem = ((quantidade * preco) * 10 ) / 100;
			double valortotal = (quantidade * preco) - porcetagem;
			System.out.printf("Valor total a ser pago: %.2f", valortotal);
		}else if(quantidade <= 50) {
			double porcetagem = ((quantidade * preco) * 20 ) / 100;
			double valortotal = (quantidade * preco) - porcetagem;
			System.out.printf("Valor total a ser pago: %.2f", valortotal);
		}else {
			double porcetagem = ((quantidade * preco) * 50 ) / 100;
			double valortotal = (quantidade * preco) - porcetagem;
		}
		

	}

}
