package Par;

public class Par {
    public static void main(String[] args) {
        int num;

        num = 2;
        System.out.println("O número " + num + " é par? " + par(num));

        num = 7;
        System.out.println("O número " + num + " é par? " + par(num));

        num = 5;
        System.out.println("O número " + num + " é par? " + par(num));

        num = 10;
        System.out.println("O número " + num + " é par? " + par(num));
    }

    public static boolean par(int v) {
        if (v % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}