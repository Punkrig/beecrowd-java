import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in).useLocale(Locale.US);
        int numFuncionario = numero.nextInt();
        int numHorasTrabalhadas = numero.nextInt();
        double valorHora = numero.nextDouble();
        double salario = valorHora * numHorasTrabalhadas;

        System.out.printf("NUMBER = %d\n",numFuncionario);
        System.out.printf(Locale.US,"SALARY = U$ %.2f\n",salario);
    }
}