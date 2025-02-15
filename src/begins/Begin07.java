package begins;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aylananing radiusinib kiriting r: ");
        double r = scanner.nextDouble();
        double uzunlik = (2 * Math.PI) * r;
        double yuzasi = (r * r) * Math.PI;
        System.out.println("Aylananing uzunligi: "+uzunlik);
        System.out.println("Aylananing yuzasi: "+yuzasi);
    }
}
