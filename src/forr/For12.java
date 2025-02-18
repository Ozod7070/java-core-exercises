package forr;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting n: ");
        int n = scanner.nextInt();
        double kopaytma = 1;
        for (double i = 1; i <= n; i+=0.1) {
            kopaytma *=i;
        }
        System.out.println("Natija "+ kopaytma);
    }
}
