package exercicio4;

public class Teatro {

	public static void main(String[] args) {
		
		
		double valor = 5; 
		int publico = 120;
		double despesa = 200.0;
		
		while(valor >= 1) {
			double valorIngressos = valor*(double)publico;
			double lucro = valorIngressos - despesa;
			
			System.out.printf("O lucro foi de: %.2f ", lucro);
			System.out.println();
			System.out.printf("valor do ingresso: %.2f ", valor);
			System.out.println();
			System.out.printf("Quantidade de ingressos " + publico);
			System.out.println();
			valor = valor - 0.5;
			publico = publico + 26;
			
		}
		
		
		
		
		
		
		
		
		

	}

}
