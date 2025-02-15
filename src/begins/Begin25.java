package begins;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting x: ");
        double x = scanner.nextDouble();
        double qiymat = 3 * Math.pow(x, 6) - 6 * Math.pow (x, 2) - 7;
        System.out.println("Funksiyaning qiyamati: "+qiymat);
    }
}
