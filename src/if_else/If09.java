package if_else;

import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        double num1 = scanner.nextDouble();
        System.out.print("Son kriting: ");
        double num2 = scanner.nextDouble();
        if(num1 < num2){
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println("birinchi son ikkinchi sondan kichik bo'lishi kerak?");
        }
    }
}
