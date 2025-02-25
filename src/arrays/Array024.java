package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array024 {
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
        if(n < 2){
            System.out.println("0");
        }
        int farq = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i-1] != farq) {
                System.out.println("0");
            }
        }
        System.out.println("Progressiya bor " + farq);
    }
}
