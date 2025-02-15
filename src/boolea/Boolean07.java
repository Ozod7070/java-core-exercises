package boolea;

import java.util.Scanner;

public class Boolean07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting A: ");
        int A = scanner.nextInt();
        System.out.print("Qiymat kiriting B: ");
        int B = scanner.nextInt();
        System.out.print("Qiymat kiriting C: ");
        int C = scanner.nextInt();
        int tekshir = (A < B && B < C) || (A > B && B > C) ? 1 : 0;
        System.out.println((tekshir == 1));
    }
}
