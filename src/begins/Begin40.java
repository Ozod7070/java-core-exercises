package begins;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A1 ga qiymat kiriting: ");
        double A1 = scanner.nextDouble();
        System.out.print("B1 ga qiymat kiriting: ");
        double B1 = scanner.nextDouble();
        System.out.print("C1 ga qiymat kiriting: ");
        double C1 = scanner.nextDouble();
        System.out.print("A2 ga qiymat kiriting: ");
        double A2 = scanner.nextDouble();
        System.out.print("B2 ga qiymat kiriting: ");
        double B2 = scanner.nextDouble();
        System.out.print("C2 ga qiymat kiriting: ");
        double C2 = scanner.nextDouble();
        double D = (A1 * B2 - A2 * B1);
        Double y = (A1 * C2 - A2 * C1) / D;
        double x = (C1 * B2 - C2 - B1) / D;
        System.out.println("x ning qiymati: "+x);
        System.out.println("y ning qiymati: "+y);
        System.out.println("d ning qiymati: "+D);
    }
}
