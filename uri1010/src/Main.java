import java.util.Locale;
import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in).useLocale(Locale.US);

        int codigo1 = numero.nextInt();
        int quantidade1 = numero.nextInt();
        double valor1= numero.nextDouble();
        int codigo2 = numero.nextInt();
        int quantidade2 = numero.nextInt();
        double valor2= numero.nextDouble();
        BigDecimal valorPagar = new BigDecimal((quantidade1*valor1)+(quantidade2*valor2));
        valorPagar =valorPagar.setScale(2,RoundingMode.HALF_UP);
        System.out.printf(Locale.US,"VALOR A PAGAR: R$ %.2f\n",valorPagar);
    }
}