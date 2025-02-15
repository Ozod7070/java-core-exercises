package begins;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Burchagini kiriting: ");
        double a = scanner.nextDouble();
        if ( a > 0 && a < 360) {
            double radian = a * (Math.PI / 180);
            System.out.println(a + " gradus " + radian + " radian");
        }
        else {
            System.out.println("0 dan katta 360 dan kichik son kiriting?");
        }

    }
}
