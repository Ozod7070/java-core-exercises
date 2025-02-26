package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix23 {
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
        for (int i = 0; i < n; i++) {
            int min = arr[i][0];
            for (int j = 0; j < m; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println("Eng kichik element = " + min);
        }
    }
}
