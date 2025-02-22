package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("massiv uzunligini kiriting: ");
        int n = scanner.nextInt();
        System.out.print("qiymat kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("qiymat kiriting b: ");
        int b = scanner.nextInt();
        int [] yigindi = new int[n];
        yigindi[0] = a;
        yigindi[1] = b;
        for (int i = 2; i < n; i++) {
            yigindi[i] = yigindi[i-2] + yigindi[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(yigindi[i] + " ");
        }

    }
}
