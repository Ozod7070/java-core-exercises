package arrays;

import java.util.Scanner;

public class Array007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("maasivning uzunligini kiriting: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "- indeksiga son kiriting: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
