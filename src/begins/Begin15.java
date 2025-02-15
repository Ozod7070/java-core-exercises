package begins;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aylananing yuzasini kiriting: ");
        double yuzasi = scanner.nextDouble();
        double radius = Math.sqrt(yuzasi / Math.PI);
        double diametr = radius * 2;
        System.out.println("Aylananing diametri: "+diametr);
        System.out.println("Aylananing radiusi: "+radius);
    }
}
