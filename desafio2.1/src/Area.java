import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		float h,b, B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a altura do trapesio: ");
		h = sc.nextFloat();
		System.out.println("informe a base menor do trapesio: ");
		b = sc.nextFloat();
		System.out.println("informe a base maior do trapesio: ");
		B = sc.nextFloat();
		
		float area = (h * (b + B)) / 2;
		
		System.out.printf("A area do trapesio é %.2f", area);

	}

}
