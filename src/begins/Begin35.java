package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qayiq tezligini kiriting: ");
        double v = scanner.nextDouble();
        System.out.println("Daryo oqimining  tezligini kiriting: ");
        double u = scanner.nextDouble();
        System.out.println("Daryo oqimiga bo'yicha harakatlanish vaqti: ");
        double t1 = scanner.nextDouble();
        System.out.println("Daryo oqimiga qarshi harakatlanish vaqti");
        double t2 = scanner.nextDouble();
        double s = (t1 * (u + v)) + ( (u - v) * t2);
        System.out.println("Qayiqni yurgan yo'li: "+s);
    }
}
