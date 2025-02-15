package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kg shokolad x: ");
        double x = scanner.nextDouble();
        System.out.print("x kg shokolad so'm turadi a: ");
        double a = scanner.nextDouble();
        System.out.print("Kg konfet y: ");
        double y = scanner.nextDouble();
        System.out.print("y kg konfet so'm turadi b: ");
        double b = scanner.nextDouble();
        double shokolad = (a / x);
        double konfet = (b / y);
        double qimmat = (shokolad - konfet);
        System.out.println("1kg shkolad 1 kg konfetdan "+qimmat + " qimmat turadi");
    }
}
