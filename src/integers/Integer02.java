package integers;

import java.util.Scanner;

public class Integer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Og'irlikni kiriting kg: ");
        int kg = scanner.nextInt();
        if (kg > 1000) {
            int tonna = kg / 1000;
            System.out.println("Toliq tonna: " + tonna);
        }
    }
}
