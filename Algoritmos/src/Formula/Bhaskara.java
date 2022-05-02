package Formula;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        double x1 = 0, x2 = 0, delta = 0, raiz = 0;

        System.out.println("Insira o valor de A: ");
        a = scan.nextInt();

        System.out.println("Insira o valor de B: ");
        b = scan.nextInt();

        System.out.println("Insira o valor de C: ");
        c = scan.nextInt();

        if (a == 0) {
            System.out.println("Não existe raiz");
        }

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não tem raízes reais");
        } else {
            System.out.println("A equação tem raízes reais");
        }
    }
}