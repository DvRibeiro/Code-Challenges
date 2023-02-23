//Read three point floating values (A, B and C) and verify if is possible to make a triangle with them. 
//If it is possible, calculate the perimeter of the triangle and print the message:
//Perimetro = XX.X
//If it is not possible, calculate the area of the trapezium which basis A and B and C as height, and print the message:
//Area = XX.X


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
