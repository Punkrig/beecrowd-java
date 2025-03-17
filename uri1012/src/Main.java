import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in).useLocale(Locale.US);
        double a= numero.nextDouble();
        double b= numero.nextDouble();
        double c = numero.nextDouble();

        //a) a área do triângulo retângulo que tem A por base e C por altura.
        double trianguloRetangulo= (a*c)/2;
        //b) a área do círculo de raio C. (pi = 3.14159)
        double circulo = 3.14159*c*c;
        //c) a área do trapézio que tem A e B por bases e C por altura.
        double trapezio = ((a+b)*c)/2;
        //d) a área do quadrado que tem lado B.
        double quadrado = b*b;
        //e) a área do retângulo que tem lados A e B.
        double retangulo= a*b;

        System.out.printf(Locale.US,"TRIANGULO: %.3f\n",trianguloRetangulo);
        System.out.printf(Locale.US,"CIRCULO: %.3f\n",circulo);
        System.out.printf(Locale.US,"TRAPEZIO: %.3f\n",trapezio);
        System.out.printf(Locale.US,"QUADRADO: %.3f\n",quadrado);
        System.out.printf(Locale.US,"RETANGULO: %.3f\n",retangulo);

    }
}