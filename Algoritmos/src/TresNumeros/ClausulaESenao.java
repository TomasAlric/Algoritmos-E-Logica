package TresNumeros;

import java.util.Scanner;

public class ClausulaESenao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;

        System.out.println("Insira o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        b = scan.nextInt();

        System.out.println("Insira o terceiro número: ");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("O maior é o A");
        } else {
            if (b > c) {
                System.out.println("O maior é o B");
            } else {
                System.out.println("O maior é o C");
            }
        }
    }
}