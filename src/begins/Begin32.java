package begins;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tempratura selsiyda  kiriting: ");
        double selsiy = scanner.nextDouble();
        double farangeyt = (selsiy * 9 / 5) + 32;
        System.out.println("Tempratura farangeytda: "+farangeyt);
    }
}
