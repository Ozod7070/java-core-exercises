package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aylananing uzunligini kiriting: ");
        double uzunlik = scanner.nextDouble();
        double radius = uzunlik * (2 * Math.PI);
        double yuzasi = radius * radius * Math.PI;
        System.out.println("Aylananing radiusi: "+radius);
        System.out.println("Aylananing yuzasi: "+yuzasi);
    }
}
