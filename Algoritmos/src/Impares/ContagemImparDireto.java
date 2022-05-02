package Impares;

import java.util.Scanner;

public class ContagemImparDireto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, s;

        s = 0;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();

        System.out.println("Digite o valor de C: ");
        c = scan.nextInt();

        s = a % 2 + b % 2 + c % 2;

        System.out.println("O números de ímpares é = " + s);
    }
}