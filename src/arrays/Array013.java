package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array013 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massivning uzunligi toq bolsin: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = n-1; i >= 0; i-=2) {
            System.out.print(arr[i] + " ");
        }
    }
}
