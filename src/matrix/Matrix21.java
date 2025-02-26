package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix21 {
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
                arr[i][j] = random.nextInt(1,6);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < n; i+=2) {
            int sum = 0;
            int counter = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
                counter++;
            }
            System.out.println("O'rtacha qiymat = " + (double)(sum / counter));
        }
    }
}
