package TresNumeros;

import java.util.Scanner;

public class TestePossibilidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;

        System.out.println("Insira o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        b = scan.nextInt();

        System.out.println("Insira o terceiro número: ");
        c = scan.nextInt();

        if ((a > b) && (b > c)) {
            System.out.println("O maior é o A");
        }
        if ((a > c) && (c > b)) {
            System.out.println("O maior é o A");
        }
        if ((b > a) && (a > c)) {
            System.out.println("O maior é o B");
        }
        if ((b > c) && (c > a)) {
            System.out.println("O maior é o B");
        }
        if ((c > a) && (a > b)) {
            System.out.println("O maior é o C");
        }
        if ((c > b) && (b > a)) {
            System.out.println("O maior é o C");
        }
    }
}