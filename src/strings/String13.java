package strings;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satr kiriting: ");
        String str = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("raqamlar soni " + counter);
    }
}
