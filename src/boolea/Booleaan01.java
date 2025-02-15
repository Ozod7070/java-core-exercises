package boolea;

import java.util.Scanner;

public class Booleaan01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Butun son kiriting: ");
        int A = scanner.nextInt();
        int musbat = (A > 0) ? 1 : 0;
        System.out.println("A soni musbat: "+ (musbat == 1 ));

    }
}
