import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int A = numero.nextInt();
        int B = numero.nextInt();
        int C = numero.nextInt();
        int D = numero.nextInt();
        int diferenca= (A * B) - (C * D);
        System.out.printf("DIFERENCA = %d\n",diferenca);

    }
}