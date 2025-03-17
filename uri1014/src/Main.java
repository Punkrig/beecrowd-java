import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int distancia= scanner.nextInt();
        double litros= scanner.nextDouble();

        double kmPorL= distancia/litros;

        System.out.printf(Locale.US,"%.3f km/l\n",kmPorL);
    }
}