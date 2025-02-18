package whiles;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Qiymat kiriting b: ");
        int b = scanner.nextInt();
        while (b <= a){
            a -=b;
        }
        System.out.println("Joylashganlar soni "+ a);
    }
}
