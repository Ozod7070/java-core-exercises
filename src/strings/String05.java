package strings;

import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Raqam kiriting: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((char)('z'- i) + " ");
        }
    }
}
