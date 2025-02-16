package if_else;

import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int num1 = scanner.nextInt();
        System.out.println("Son kiriting: ");
        int num2 = scanner.nextInt();
        if(num1 < num2){
            System.out.println(num1);
            System.out.println(num2);
        }else {
            System.out.println("Birinchi son ikkinchisidan kichik bolishi kerak");
        }
    }
}
