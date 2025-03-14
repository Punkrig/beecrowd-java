import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        double pi = 3.14159;
        int raio = numero.nextInt();

        double area = (4/3.0)*pi*raio*raio*raio;

        System.out.printf(Locale.US,"VOLUME = %.3f\n",area);
    }
}