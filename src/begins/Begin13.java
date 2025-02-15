package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi aylananing radiusi: ");
        double r1 = scanner.nextDouble();
        System.out.print("Ikkinchi aylananing radiusi: ");
        double r2 = scanner.nextDouble();
        if ( r1 > r2) {
            double yuza1 = Math.PI * r1;
            double yuza2 = Math.PI * r2;
            double ayirma = yuza1 - yuza2;
            System.out.println("Aylanalarning ayirmsi: " + ayirma);
        }
        else {
            System.out.println("Birinchi aylananing radiusi katta bo'lish kerak");
        }

    }
}
