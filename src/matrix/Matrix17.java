package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix17 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Etajlar uzunligini kiriting: ");
        int n = scanner.nextInt();
        System.out.print("Xonalar uzunligini kiriting: ");
        int m = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int k = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(1,4);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        int kopaytma = 1;
            for (int j = 0; j < m; j++) {
                sum += arr[k][j];
                kopaytma *= arr[k][j];
        }
        System.out.println("yigindisi = "+sum);
        System.out.println("kopaytmasi = "+kopaytma);
    }
}
