package Impares;

import java.util.Scanner;

public class ContagemImparesSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, s;

        s = 0;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();

        if (a % 2 == 1) {
            s += 1;
        }

        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();

        if (b % 2 == 1) {
            s += 1;
        }

        System.out.println("Digite o valor de C: ");
        c = scan.nextInt();

        if (c % 2 == 1) {
            s += 1;
        }

        System.out.println("O total de números ímpares = " + s);
    }
}