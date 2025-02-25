package strings;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        char chOxiri = str.charAt(str.length()-1);
        char chBoshi = str.charAt(0);
        System.out.println("birinchi belgisi " + (int)(chBoshi));
        System.out.println("oxirgi belgisi " + (int)(chOxiri));
    }
}
