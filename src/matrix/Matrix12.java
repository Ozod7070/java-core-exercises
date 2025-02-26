package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Etajlar uzunligini kiriting: ");
        int n = scanner.nextInt();
        System.out.print("Xonalar uzunligini kiriting: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(11);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                }
             else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
