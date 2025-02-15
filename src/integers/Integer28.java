package integers;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kirting 1-365 gacha: ");
        int k = scanner.nextInt();
        System.out.println("Qaysi kunga togri kelishini kiriting 0-6 gacha: ");
        int n = scanner.nextInt();
        if (k > 0 && k < 366 && n >= 0 && n < 7) {
            int kun = (k - n) % 7;
            String[] kunlar = {"Yakshanba", "Dushanba", "Seshanba", "Chorshanba", "Payshanba", "Juma", "Shanba"};
            System.out.println("k soni " + k + " shu haftaning kuniga to'g'ri keladi " + kunlar[kun]);
        } else {
            System.out.println("Xatolik");
        }
    }
}
