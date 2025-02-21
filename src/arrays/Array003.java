package arrays;

import java.util.Scanner;

public class Array003 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print(" massivning o'lchamini kiriting: ");
                int n = scanner.nextInt();
                System.out.print(" birinchi had olchmamini kiriting: ");
                int a = scanner.nextInt();
                System.out.print(" ayirmaga sonini kiriting: ");
                int d = scanner.nextInt();
                int[] progressiya = new int[n];
                for (int i = 0; i < n; i++) {
                    progressiya[i] = a + i * d;
                }
                System.out.println("Arifmetik progressiyaning " + n + " hadlari:");
                for (int i = 0; i < n; i++) {
                    System.out.print(progressiya[i] + " ");
                }
            }
        }


