package Impares;

import java.util.Scanner;

public class ContagemImparesSemaforoSenao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();

        if ((a % 2 == 0) && (b % 2 == 0)) {
            System.out.println("VERDE");
        } else {
            if ((a % 2 == 1) && (b % 2 == 1)) {
                System.out.println("VERMELHO");
            } else {
                System.out.println("AMARELO");
            }
        }
    }
}