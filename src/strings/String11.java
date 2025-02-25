package strings;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder res = stringBuilder.reverse();
        System.out.println(res);

    }
}
