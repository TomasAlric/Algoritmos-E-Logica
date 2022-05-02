package Procedimento;

import java.util.Scanner;

public class SomaDoisParametros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("Digite o valor de X: ");
        x = scan.nextInt();

        System.out.println("Digite o valor de Y: ");
        y = scan.nextInt();

        System.out.println(soma(x, y));
    }

    public static int soma(int x, int y) {
        int res = x + y;
        return res;
    }
}