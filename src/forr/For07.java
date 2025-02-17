package forr;

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting a: ");
        int a = scanner.nextInt();
        System.out.println("Qiymat kiriting b:");
        int b = scanner.nextInt();
        int summa = 0;
        for (int i = a; i < b; i++) {
            summa +=i;
        }
        System.out.println(summa);
    }
}
