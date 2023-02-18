package ex1036;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double a = teclado.nextDouble();
	Double b = teclado.nextDouble();
	Double c = teclado.nextDouble();
	Double delta = (b * b) - 4 * a * c;
	Double r1 = ((-b) + Math.sqrt(delta)) / (2*a);
	Double r2 = ((-b) - Math.sqrt(delta)) / (2*a);
	
	if (delta < 0 | a == 0) {
		System.out.print("Impossivel calcular");
	} else {
		System.out.println("R1 = " + r1);
		System.out.print("R2 = " + r2);
	}
	
			}
		}
	



