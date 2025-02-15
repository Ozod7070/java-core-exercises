package begins;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tempratura farangeytda  kiriting: ");
        double t = scanner.nextDouble();
        double gradus = (t - 32) * 5 / 9;
        System.out.println("Tempratura selsiyda: "+gradus);
    }
}
