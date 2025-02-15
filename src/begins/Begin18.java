package begins;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A nuqtaga son kiriting: ");
        double A = scanner.nextDouble();
        System.out.print("B nuqtaga son kiriting: ");
        double B = scanner.nextDouble();
        System.out.print("C nuqtaga son kiriting: ");
        double C = scanner.nextDouble();
        double AC = Math.abs(C - A);
        double BC = Math.abs(C - B);
        double kopaytma = Math.abs(AC * BC);
        System.out.println("Kesmalar uzunligining kopaytmasi: "+kopaytma);

    }
}
