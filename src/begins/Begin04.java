package begins;

import java.util.Scanner;

public class Begin04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aylananing diametirini kiriting a: ");
        double a = scanner.nextDouble();
        double uzunlik = (Math.PI * a);
        System.out.println("Aylananing uzunligi: "+uzunlik);

    }
}
