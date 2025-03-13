import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int n1 = numero.nextInt();
        int n2 = numero.nextInt();

        System.out.printf("PROD = %d\n",n1*n2);

    }
}