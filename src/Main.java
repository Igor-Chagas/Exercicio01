import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de a: ");
		a = sc.nextInt();
		System.out.println("Informe o valor de :b ");
		b = sc.nextInt();
		
		result = a + b;
		
		System.out.println("Resultado da soma: " + result);
		
	}

}
