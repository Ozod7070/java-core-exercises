package forr;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting n: ");
        int n = scanner.nextInt();
        int summa = 0;
        for (int i = n; i <= 2 * n; i++) {
            summa = i * i;
        }
        System.out.println("Natija "+ summa);
    }
}
