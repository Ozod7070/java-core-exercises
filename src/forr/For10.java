package forr;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting n: ");
        int n = scanner.nextInt();
        double summa = 0.0;
        for (double i = 1; i <= n; i++) {
            summa += 1 / i;
        }
        System.out.println("Natija "+ summa);
    }
}
