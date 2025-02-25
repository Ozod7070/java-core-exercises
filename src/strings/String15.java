package strings;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("kichik harflar soni " + counter);
    }
}
