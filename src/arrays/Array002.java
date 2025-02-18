package arrays;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = scanner.nextInt();
        int [] arr = new  int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.pow(2, i+1);
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
