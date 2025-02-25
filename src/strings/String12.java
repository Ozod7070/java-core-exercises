package strings;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String s = scanner.nextLine();
        System.out.print("Son kiriting: ");
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if (i != s.length() - 1) {
                for (int j = 0; j < n; j++) {
                    result.append("*");
                }
            }
        }
        System.out.println("Natija: " + result.toString());
    }
}
