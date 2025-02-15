package integers;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faylning hajmini kiriting baytlarda: ");
        long baytlar = scanner.nextLong();
        if ( baytlar >= 1024) {
            long kb = baytlar / 1024;
            System.out.println("Kilabaytlarda: " + kb);
        }
        else{
            System.out.println("1024 dan katta son kiriting?");
        }
    }
}
