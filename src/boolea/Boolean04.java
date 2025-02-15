package boolea;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting A: ");
        int A = scanner.nextInt();
        System.out.print("Qiymat kiriting B: ");
        int B = scanner.nextInt();
        int tekshir = (A > 2 && B <= 3) ? 1 : 0;
        System.out.println((tekshir == 1));
    }
}
