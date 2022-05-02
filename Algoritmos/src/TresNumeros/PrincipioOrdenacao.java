package TresNumeros;

import java.util.Scanner;

public class PrincipioOrdenacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Insira o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        b = scan.nextInt();

        System.out.println("Insira o terceiro número: ");
        c = scan.nextInt();

        if (a > b) {
            d = a;
            a = b;
            b = d;
        }
        if (b > c) {
            d = b;
            b = c;
            c = d;
        }
        System.out.println("O maior é o " + c);
    }
}