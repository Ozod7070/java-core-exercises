package begins;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A ga qiymat kiriting: ");
        double A = scanner.nextDouble();
        System.out.print("B ga qiymat kiriting: ");
        double B = scanner.nextDouble();
        if (A != 0) {
            double natija = Math.abs(B / A);
            System.out.println("x ning qiymati: " + natija);
        } else {
            System.out.println("A = 0 ga teng bolmasligi kerak?");
        }
    }
}
