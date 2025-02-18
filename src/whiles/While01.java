package whiles;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Qiymat kiriting b: ");
        int b = scanner.nextInt();
        int sanoq = 0;
        int joylashmagan = a;
        while (joylashmagan >= b){
            joylashmagan -=b;
        }
        System.out.println("Joylashamagan qiami "+ joylashmagan);

    }
}
