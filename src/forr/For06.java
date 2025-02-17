package forr;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 kg konfet narxini kiriting: ");
        double kg1 = scanner.nextDouble();
        for (double i = 1.2; i <= 2; i+=0.2) {
            System.out.println(i + "kg konfet narxi "+ Math.ceil(kg1 * i)+ " ming so'm");
        }
    }
}
