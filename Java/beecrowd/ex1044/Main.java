package ex1044;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double a,b;
	a = entrada.nextDouble();
	b = entrada.nextDouble();
	
	
	if ((((a / b) % 1) == 0) | (((b / a) % 1) == 0)) {
	System.out.println("Sao multiplos");
	} else {
		System.out.println("Nao sao multiplos");
	}

	}
}