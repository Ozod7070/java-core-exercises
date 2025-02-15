package boolea;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son = scanner.nextInt();
        int tekshir = (son > 99 && son < 1000 && son % 2 != 0) ? 1 : 0;
        System.out.println(tekshir == 1);
    }
}
