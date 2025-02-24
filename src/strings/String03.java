package strings;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("raqam kiriting: ");
        int num = scanner.nextInt();
        char chFirst = (char)(num-1);
        char chLast = (char)(num+1);
        System.out.println("Bitta oldingi belgi = " + chFirst);
        System.out.println("Bitta keyingi belgi = " + chLast);

    }
}
