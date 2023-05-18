package ex1045;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a < b) {
            double aux = a;
            a = b;
            b = aux;
        }
        if (a < c) {
            double aux = a;
            a = c;
            c = aux;
        }
        if (b < c) {
            double aux = b;
            b = c;
            c = aux;
        }
        if (a >= (b + c))
            System.out.println("NAO FORMA TRIANGULO");
        else {
            if (a * a == (b * b + c * c))
                System.out.println("TRIANGULO RETANGULO");
            if (a * a > (b * b + c * c))
                System.out.println("TRIANGULO OBTUSANGULO");
            if (a * a < (b * b + c * c))
                System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && a == c)
                System.out.println("TRIANGULO EQUILATERO");
            if (a == b && a != c || c == a && c != b || b == c && b != a);
                System.out.println("TRIANGULO ISOSCELES");
        }
    }
}





















