package begins;

import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Qiymat kiriting A: ");
        double A = scanner.nextDouble();
        System.out.print("Qiymat kiriting B: ");
        double B = scanner.nextDouble();
        System.out.print("Qiymat kiriting C: ");
        double C = scanner.nextDouble();
        double temp = C;
        double a = B;
        double b = temp;
        double c = A;
        System.out.println("A ning yangi qiymati: "+a);
        System.out.println("B ning yangi qiymati: "+b);
        System.out.println("C ning yangi qiymati: "+c);
    }
}
