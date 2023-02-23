package ex1043;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double a,b,c;
	a = entrada.nextDouble();
	b = entrada.nextDouble();
	c = entrada.nextDouble();
	
	if (a + b > c && a + c > b && c + b > a) {
		double perimeter = (a + b + c);
		System.out.println("Perimeter = " + perimeter);
	} else {
		double trapezium_area = (((a + b) * c) / 2);
		System.out.println("Area = " + trapezium_area);
	}
	
	
	}
}
