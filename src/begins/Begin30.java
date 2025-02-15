package begins;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Burchagini kiriting: ");
        double a = scanner.nextDouble();
        if ( a > 0) {
            double gradus  = a * (180 / Math.PI);
            System.out.println(a + " radian " + gradus + " gradus");
        }
        else {
            System.out.println("0 dan katta son kiriting?");
        }

    }

}
