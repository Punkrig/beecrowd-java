import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int n1 = numero.nextInt();
        int n2 = numero.nextInt();

        System.out.printf("SOMA = %d\n",n1+n2);

    }
}