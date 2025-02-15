package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting A: ");
        double A = scanner.nextDouble();
        double A2 = Math.pow(A, 2);
        double A3 = Math.pow(A, 3);
        double A5 = Math.pow(A, 5);
        double A10 = Math.pow(A, 10);
        double A15 = Math.pow(A, 15);
        System.out.println("A^2: "+A2);
        System.out.println("A^3: "+A3);
        System.out.println("A^5: "+A5);
        System.out.println("A^10: "+A10);
        System.out.println("A^15: "+A15);
    }
}
