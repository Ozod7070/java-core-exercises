package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix26 {
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
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < m; i++) {
            int kopaytma = 1;
            for (int j = 0; j < m; j++) {
                kopaytma *= arr[j][i];
            }
            if(min > kopaytma){
                min = kopaytma;
                index = i;
            }
        }
        System.out.println(min);
        System.out.println(index);

    }
}
