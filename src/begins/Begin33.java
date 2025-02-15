package begins;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kg konfet x: ");
        double x = scanner.nextDouble();
        System.out.print("So'm turadi a: ");
        double a = scanner.nextDouble();
        System.out.print("Necha kg konfet olasiz y: ");
        double y = scanner.nextDouble();
        double shokoladKG1 = (a * 1) / x;
        double Shokolady = (a * y) / x;
        System.out.println("1 kg konfet narxi: "+shokoladKG1);
        System.out.println("y kg narxi: "+Shokolady);
    }
}
