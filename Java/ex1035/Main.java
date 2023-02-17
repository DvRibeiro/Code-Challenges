/* Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and 
if the sum of C and D is greater than the sum of A and B and if C and D were positives values and if A is even 
write the message “Valores aceitos” (Accepted values). Otherwise, write the message “Valores nao aceitos” (Values not accepted).
*/
package ex1035;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int A = teclado.nextInt();
	int B = teclado.nextInt();
	int C = teclado.nextInt();
	int D = teclado.nextInt();
	int sum1 = (C + D);
	int sum2 = (A + B);
	if	(B > C && D > A && sum1 > sum2 && C > 0 && D > 0 && A % 2 == 0 ) {
		System.out.println("Valores aceitos");
	} else {
		System.out.println("Valores nao aceitos");
		}
	}
	

}
