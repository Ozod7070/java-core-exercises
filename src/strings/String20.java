package strings;

import java.util.Scanner;

public class String20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        if(str.matches("\\d+")){
            System.out.println(str);
        }else {
            System.out.println("error");
        }
    }
}
