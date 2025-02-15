package boolea;

import java.util.Scanner;

public class Boolean03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Butun son kiriting: ");
        int A = scanner.nextInt();
        int juft = (A % 2 == 0) ? 1 : 0;
        System.out.println("A soni juft: "+ (juft == 1 ));

    }
}
