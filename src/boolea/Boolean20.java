package boolea;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 99 && son < 1000){
            int a = son % 10;
            int b = son / 10 % 10;
            int c = son / 100;
            int analiz = (a != b && a != c) ? 1 : 0;
            System.out.println(analiz == 1);
        }
        else {
            System.out.println("Uch xonali son kiriting?");
        }

    }
}
