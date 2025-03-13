import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in).useLocale(Locale.US);

        double n1 = numero.nextDouble();
        double n2 = numero.nextDouble();
        double n3= numero.nextDouble();
        double media= ((n1*2)+(n2*3)+(n3*5))/10;
        System.out.printf(Locale.US,"MEDIA = %.1f\n",media);

    }
}