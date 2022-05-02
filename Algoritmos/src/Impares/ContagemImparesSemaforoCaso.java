package Impares;

import java.util.Scanner;

public class ContagemImparesSemaforoCaso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();

        switch (a) {
            case 1:
                System.out.println("VERMELHO");
                break;
            case 2:
                System.out.println("VERDE");
                break;
            default:
                System.out.println("AMARELO");
        }
    }
}