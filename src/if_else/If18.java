package if_else;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num1 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int num2 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int num3 = scanner.nextInt();
        if(num1 == num2){
            System.out.println(num3);
        }else if(num1 == num3){
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
    }
}
