package forr;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting k: ");
        int k = scanner.nextInt();
        System.out.print("Necha marta chiqarilsin: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(k +" ");

        }
    }
}
