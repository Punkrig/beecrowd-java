import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in).useLocale(Locale.US);

        double n1 = numero.nextDouble();
        double n2 = numero.nextDouble();
        double media= ((n1*3.5)+(n2*7.5))/11;
        System.out.printf(Locale.US,"MEDIA = %.5f\n",media);

    }
}