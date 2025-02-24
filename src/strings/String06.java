package strings;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Belgi kiriting: ");
        char ch = scanner.next().charAt(0);
       if(Character.isDigit(ch)){
           System.out.println("raqam");
       } else if (ch >= 'A' && ch <= 'z') {
           System.out.println("lotin harf");
       }else {
           System.out.println("0");
       }
    }
}
