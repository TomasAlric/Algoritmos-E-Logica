package Procedimento;

public class SomaParametro {

    public static void main(String[] args) {
        System.out.println(soma(5));
        System.out.println(soma(7));
    }

    public static int soma(int x) {
        x = x + x;
        return x;
    }
}