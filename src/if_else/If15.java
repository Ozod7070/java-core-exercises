package if_else;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num1 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int num2 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int num3 = scanner.nextInt();
        if(num1 > num2 && num2 > num3){
            System.out.println(num1);
            System.out.println(num2);
        }else if(num1 > num2 && num3 > num2){
            System.out.println(num1);
            System.out.println(num3);
        } else{
            System.out.println(num2);
            System.out.println(num3);
        }

        }
    }

