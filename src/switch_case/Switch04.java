package switch_case;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting: ");
        int oy = scanner.nextInt();
        switch (oy){
            case 1 -> System.out.println("Yanvar 31 kun");
            case 2 -> System.out.println("Fvral 28 kun");
            case 3 -> System.out.println("Mart 31 kun");
            case 4 -> System.out.println("Aprel 30 kun");
            case 5 -> System.out.println("May 31 kun");
            case 6 -> System.out.println("Iyun 30 kun");
            case 7 -> System.out.println("Iyul 31 kun");
            case 8 -> System.out.println("Avgust 31 kun");
            case 9 -> System.out.println("Sentabr 30 kun");
            case 10 -> System.out.println("Oktyabr 31 kun");
            case 11 -> System.out.println("Noyabr 30 kun");
            case 12 -> System.out.println("Dekabr 31 kun");
            default -> System.out.println("Bunaqa oy mavjud emas");

        }
    }
}
