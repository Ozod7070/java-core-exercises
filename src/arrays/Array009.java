package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array009 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("masssiv uzuligini kiriting: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "-indeksga son kiriting:");
            arr[i] = scanner.nextInt();
        }
        String res = "";
       Arrays.toString(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                res = arr[i] + res;
            }
        }
        System.out.println(res);

    }
}
