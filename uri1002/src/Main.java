import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner raio = new Scanner(System.in);
        double n = 3.14159;
        double r= raio.nextDouble();

        double area = (r*r)*n;

        System.out.printf(Locale.US,"A=%.4f\n", area);

    }
}