package strings;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("belgi kiriting: ");
        char ch = scanner.next().charAt(0);
        int n = (int)(ch);
        System.out.println(n);
    }
}
