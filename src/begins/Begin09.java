package begins;

import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting a: ");
        double a = scanner.nextDouble();
        System.out.print("Son kiriting b: ");
        double b = scanner.nextDouble();
        if ( a > 0 && b > 0) {
            double geometrik = Math.sqrt(a * b);
            System.out.println("Ikkta sonning o'rta geometrigi: " + geometrik);
        }
        else {
            System.out.println("Ikkala son ham manfiy bolmasin: ");
        }
    }
}
