package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting n: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(11);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            for (int j = i + 1; j < n; j++) {
                System.out.print(arr[j][n - i -1]+ " ");
            }
            System.out.println();
        }
    }
}
