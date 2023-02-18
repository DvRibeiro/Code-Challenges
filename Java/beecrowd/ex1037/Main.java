//You must make a program that read a float-point number and print a message saying in which of following intervals the number belongs: [0,25] (25,50], (50,75], (75,100].
//If the read number is less than zero or greather than 100, the program must print the message “Fora de intervalo” that means "Out of Interval".

package ex1037;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num = teclado.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.println("Intervalo [0,25]");
		} 
		
		else if (num > 25 && num <= 50) {
			System.out.println("Intervalo (25,50]");
		} 
		
		else if (num > 75 && num <= 100) {
			System.out.println("Intervalo (75,100]");
		} 
		
	    else if (num < 0 || num > 100) {
			System.out.println("Fora de intevalo");
		}
	    
	        

	}

}
