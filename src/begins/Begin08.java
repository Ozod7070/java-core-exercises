package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting a: ");
        double a = scanner.nextDouble();
        System.out.print("Qiymat kiriting b: ");
        double b = scanner.nextDouble();
        double orta = (a + b) / 2;
        System.out.println("Ikkta sonning o'rta arfmetigi: "+orta);

    }
}
