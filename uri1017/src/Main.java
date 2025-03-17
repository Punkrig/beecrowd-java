import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horas= scanner.nextInt();
        int velocidaMedia= scanner.nextInt();

        double litros =  (horas*velocidaMedia)/12.0;
        System.out.printf(Locale.US,"%.3f\n",litros);
    }
}