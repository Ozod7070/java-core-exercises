package integers;

import java.util.Scanner;

public class Integer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzaunlikni kiriting sm: ");
        int sm = scanner.nextInt();
        int metr = sm / 100;
        System.out.println("Toliq metr: "+metr);
    }
}
