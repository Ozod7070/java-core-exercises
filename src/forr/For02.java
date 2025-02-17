package forr;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Son kiriting b: ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i+" ");
        }
    }
}
