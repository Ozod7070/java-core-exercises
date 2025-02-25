package strings;

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satr kiriting: ");
        String str1 = scanner.nextLine();
        System.out.println("Satr kiriting: ");
        String str2 = scanner.nextLine();
        String str3 = str1 + str2;
        System.out.println(str3);
    }
}
