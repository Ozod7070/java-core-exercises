package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Son kiriting x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Son kiriting x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Son kiriting y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Son kiriting y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("Son kiriting y3: ");
        double y3 = scanner.nextDouble();
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double CB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double CA = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double perimetrUm = AB + CB + CA;
        double a = perimetrUm / 2;
        double yuza = Math.sqrt(a * (a - AB) * (a - CB) * (a - CA));
        System.out.println("Uchburchakning yuzasi: "+yuza);
        System.out.println("Uchburchakning perimetri: "+perimetrUm);

    }
}
