package strings;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        StringBuilder revers = new StringBuilder(str);
        if(str.matches("\\d+")){
            System.out.println(revers.reverse());

        }else {
            System.out.println("error");
        }
    }
}
