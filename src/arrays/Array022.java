package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array022 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivning uzunligini kiriting: ");
        int n = scanner.nextInt();
        System.out.print("Qaysi indeksdan boshlash kerak: ");
        int k = scanner.nextInt();
        System.out.print("Qaysi indexgacha: ");
        int l = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int sumJami = 0;
        for (int i = 0; i < n; i++) {
            sumJami += arr[i];
        }
        int sum = 0;
        for (int i = k+1; i < l; i++) {
            sum += arr[i];
        }
        System.out.println(sumJami - sum);
    }
}
