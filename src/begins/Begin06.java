package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi tomonini kiriting a: ");
        double a = scanner.nextDouble();
        System.out.print("Ikkinchi tomoni kiriting b: ");
        double b = scanner.nextDouble();
        System.out.print("Uchinchi tomonini kiriting c: ");
        double c = scanner.nextDouble();
        double hajmi = (a * b * c);
        double sirti = 2 * (a * b + b * c + a * c);
        System.out.println("Paralelapepidning hajmi: "+hajmi);
        System.out.println("Paralelapepidning tola sirti: "+sirti);


    }
}
