//Write an algorithm that reads two floating values (x and y), which should represent the coordinates of a point in a plane. 
//Next, determine which quadrant the point belongs, or if you are at one of the Cartesian axes or the origin (x = y = 0).
//If the point is at the origin, write the message "Origem".
//If the point is at X axis write "Eixo X", else if the point is at Y axis write "Eixo Y".




package ex1041;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float x = entrada.nextFloat();
	float y = entrada.nextFloat();
	
	if (x > 0 && y > 0) {
		System.out.println("Q1");
	} else if (x < 0 && y > 0) {
		System.out.println("Q2");
	} else if (x < 0 && y < 0) {
		System.out.println("Q3");
	} else if (x > 0 && y < 0) {
		System.out.println("Q4");
	} else if (x == 0 & y == 0) {
		System.out.println("Origem");
	} else if (y == 0) {
		System.out.println("Eixo X");
	} else if (x == 0) {
		System.out.println("Eixo Y");
	}
	
	
	}
}
