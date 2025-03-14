import java.util.Locale;
import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in).useLocale(Locale.US);

        String nomeFuncionario = numero.nextLine();
        double salarioFixo = numero.nextDouble();
        double numeroDeVendas = numero.nextDouble();
        BigDecimal salario = new BigDecimal(salarioFixo+(numeroDeVendas*0.15));
        salario =salario.setScale(2,RoundingMode.HALF_UP);
        System.out.printf(Locale.US,"TOTAL = R$ %.2f\n",salario);
    }
}