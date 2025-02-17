package forr;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 kg konfet narxini kiriting: ");
        double kg1 = scanner.nextDouble();
        double gr100 = kg1 / 10;
        for (double i = 0.1; i <= 1; i+=0.1) {
            System.out.println(i + "kg konfet narxi "+ Math.ceil(kg1 * i )+ " ming so'm");
        }
    }
}
