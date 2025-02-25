package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array018 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massivning uzunligini kiriting: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int temp = arr[n-1];
        for (int i = 0; i < n; i++) {
            if(temp > arr[i]){
                System.out.print(arr[i] + " ");
            }else{
                System.out.println("0");
            }
        }
    }
}
