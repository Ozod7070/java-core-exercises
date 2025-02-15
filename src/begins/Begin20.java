package begins;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Son kiriting x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Son kiriting y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Son kiriting y2: ");
        double y2 = scanner.nextDouble();
        double masofa = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Ikki nuqta orasidagi masofa: " + masofa);
    }
}
