package strings;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Probelsiz satr kiriting: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
