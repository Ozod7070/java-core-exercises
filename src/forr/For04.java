package forr;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 kg konfet narxini kiriting: ");
        double kg1 = scanner.nextDouble();
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + "kg konfet narxi "+ kg1 * i + " ming so'm");
        }
    }
}
