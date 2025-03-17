import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double x1= scanner.nextDouble();
        double y1= scanner.nextDouble();
        double x2= scanner.nextDouble();
        double y2= scanner. nextDouble();

        double x= Math.pow(x2-x1,2);
        double y= Math.pow(y2-y1,2);

        double distancia= Math.sqrt(x+y);

        System.out.printf(Locale.US,"%.4f\n",distancia);

    }
}