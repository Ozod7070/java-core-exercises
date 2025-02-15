package integers;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kirting 1-365 gacha: ");
        int k = scanner.nextInt();
        int kun = k % 7;
        String[] kunlar = {"Yakshanba", "Dushanba", "Seshanba", "Chorshanba", "Payshanba", "Juma", "Shanba"};
        System.out.println("k soni "+k+ " shu hafta kuniga to'g'ri keladi "+kunlar[kun]);

    }
}
