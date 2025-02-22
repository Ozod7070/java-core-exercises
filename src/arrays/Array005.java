package arrays;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("qiymat kiriting: ");
        int n = scanner.nextInt();
        int [] fibonachi = new int[n];
        fibonachi[0] = 0;
        fibonachi[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonachi[i] = fibonachi[i-2] + fibonachi[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonachi[i] + " ");
        }
    }
}
