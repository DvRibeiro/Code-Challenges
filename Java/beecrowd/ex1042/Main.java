//Read three integers and sort them in ascending order. After, print these values in ascending order, a blank line 
//and then the values in the sequence as they were readed.




package ex1042;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int a,b,c;
	String blank = System.lineSeparator();
	a = entrada.nextInt();
	b = entrada.nextInt();
	c = entrada.nextInt();

	if 		  (a < b && a < c) {
		System.out.println(a);
		if (b < c) {
			System.out.println(b);
			System.out.println(c);
		} else {
			System.out.println(c);
			System.out.println(b);
		}
	} else if (c < b && c < a) {
		System.out.println(c);
		if (b < a) {
			System.out.println(b);
			System.out.println(a);
		} else {
			System.out.println(a);
			System.out.println(b);
		}
	} else if (b < a && b < c) {
		System.out.println(b);
		if (a < c) {
			System.out.println(a);
			System.out.println(c);
		} else {
			System.out.println(c);
			System.out.println(a);
		}
	}
	System.out.println(blank);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

	
	}
}
