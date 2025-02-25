package strings;

import java.util.Scanner;

public class String18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        String resLower = str.toLowerCase();
        String resUpper = str.toUpperCase();
        System.out.println(resLower);
        System.out.println(resUpper);

    }
}
