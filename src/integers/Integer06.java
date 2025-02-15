package integers;

import java.util.Scanner;

public class Integer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ikki xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 9 && son < 100) {
            int onlik = son / 10;
            int birlik = son % 10;
            System.out.println("Sonning o'nlar xonasidagi raqam: " + onlik);
            System.out.println("Sonning birlar xonasidagi raqam: " + birlik);
        }
        else{
            System.out.println("Ikki xonali son kiriting?");
        }
    }
}
