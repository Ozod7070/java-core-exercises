package strings;

import java.util.Scanner;

public class String22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.matches("\\d+")){
                sum += str.charAt(i) - '0';
            }
            else {
                System.out.println("error");
            }
        }
        System.out.println(sum);
    }
}
