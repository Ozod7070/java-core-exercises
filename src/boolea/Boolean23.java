package boolea;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 99 && son < 1000) {
            int a = son % 10;       // birlik
            int b = son / 10 % 10;  // o'nlik
            int c = son / 100;      // yuzlik
            if (a == c) {
                System.out.println("Ikkala tomondan oqiganda ham bir xil son");
            } else {
                System.out.println("Ikkala tomondan oqiganda bir xil emas");
            }
        } else {
            System.out.println("Uch xonali son kiriting");
        }
    }
}
