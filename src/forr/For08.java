package forr;

import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Qiymat kiriting b: ");
        int b = scanner.nextInt();
        int kopaytma = 1;
        for (int i = a; i < b; i++) {
            kopaytma *=i;
        }
        System.out.println(kopaytma);
    }
}
