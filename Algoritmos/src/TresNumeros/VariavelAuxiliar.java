package TresNumeros;

import java.util.Scanner;

public class VariavelAuxiliar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, maior;

        System.out.println("Insira o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Insira o segundo número: ");
        b = scan.nextInt();

        System.out.println("Insira o terceiro número: ");
        c = scan.nextInt();

        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        System.out.println("O maior é o " + maior);
    }
}