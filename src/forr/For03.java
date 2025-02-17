package forr;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Son kiriting b: ");
        int b = scanner.nextInt();
        for (int i = b-1; a < i; i--) {
            System.out.print(i+" ");
        }
    }
}
