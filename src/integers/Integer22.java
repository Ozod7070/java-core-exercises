package integers;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sekund kiriting: ");
        int sekund = scanner.nextInt();
        int soat = sekund / (60 * 60);
        int sekundQ = sekund % 60;
        System.out.println("To'la o'tgan soat: "+soat);
        System.out.println("Qoldiq sekund: "+sekundQ);

    }
}
