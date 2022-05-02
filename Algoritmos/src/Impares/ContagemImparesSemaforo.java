package Impares;

import java.util.Scanner;

public class ContagemImparesSemaforo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();

        if ((a % 2 == 0) && (b % 2 == 0)) {
            System.out.println("VERDE");
        }

        if ((a % 2 == 1) && (b % 2 == 1)) {
            System.out.println("VERMELHO");
        }

        if ((a % 2 == 1) && (b % 2 == 0) || (a % 2 == 0) && (b % 2 == 1)) {
            System.out.println("AMARELO");
        }
    }
}