package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array021 {
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
        int sum = 0;
        int counter = 0;
        for (int i = k+1; i < l; i++) {
            if(k >= 0 && l <= n){
                sum += arr[i];
                counter++;
            }
        }
        System.out.println("O'rta arfmetigi = " + (double)(sum / counter));
    }
}
