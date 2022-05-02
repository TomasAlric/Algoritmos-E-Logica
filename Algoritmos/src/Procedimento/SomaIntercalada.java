package Procedimento;

import java.util.Scanner;

public class SomaIntercalada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("Digite o valor de X: ");
        x = scan.nextInt();

        System.out.println("Digite o valor de Y: ");
        y = scan.nextInt();

        System.out.println(soma(soma(x, y), 10) * 2);
    }

    public static int soma(int x, int y) {
        return x + y;
    }
}