package begins;

import java.util.Scanner;

public class Begin19 {
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
        double uzunlikX = Math.abs(x1 - x2);
        double uzunlikY = Math.abs(y1 - y2);
        double perimetr = (uzunlikX + uzunlikY) * 2;
        double yuza = uzunlikX * uzunlikY;
        System.out.println("Perimetri: "+perimetr);
        System.out.println("Yuzasi: "+yuza);
    }
}
