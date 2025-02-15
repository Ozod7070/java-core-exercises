package begins;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Qiymat kiriting A: ");
        double A = scanner.nextDouble();
        System.out.print("Qiymat kiriting B: ");
        double B = scanner.nextDouble();
        System.out.print("Qiymat kiriting C: ");
        double C = scanner.nextDouble();
        double temp = A;
        double a = B;
        double b = C;
        double c = temp;
        System.out.println("A ning yangi qiymati: "+a);
        System.out.println("B ning yangi qiymati: "+b);
        System.out.println("C ning yangi qiymati: "+c);
    }
}
