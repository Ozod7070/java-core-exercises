package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array016 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massivning uzunligini kiriting juft: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            System.out.print(arr[i] + " ");
            i++;
            if (i <= j) {
                System.out.print(arr[j] + " ");
                j--;
            }
        }
    }
}
