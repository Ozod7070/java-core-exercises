package arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Array008 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("masssiv uzuligini kiriting: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "-indeksga son kiriting:");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
