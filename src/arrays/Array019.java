package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array019 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 o'lchamli massiv yaratildi.");
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int arr1 = arr[0];
        int arr10 = arr[n - 1];
        int lastIndex = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr1 < arr[i] && arr[i] < arr10) {
                lastIndex = i;
            }
        }

        System.out.println(lastIndex);
    }
}
