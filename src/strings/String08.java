package strings;

import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("raqm kiriting: ");
        int num = scanner.nextInt();
        System.out.print("belgi kiriting: ");
        char ch = scanner.next().charAt(0);
        for (int i = 0; i < num; i++) {
            System.out.print(ch + " ");
        }
    }
}
