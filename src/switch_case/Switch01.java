package switch_case;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hafta kunini kiriting: ");
        int hafta = scanner.nextInt();
        switch (hafta){
            case 1 -> System.out.println("Dushanba");
            case 2 -> System.out.println("Seshanba");
            case 3 -> System.out.println("CHorshanba");
            case 4 -> System.out.println("Payshanba");
            case 5 -> System.out.println("Juma");
            case 6 -> System.out.println("Shanba");
            case 7 -> System.out.println("Yakshanba");
            default -> System.out.println("Bunaday hafta kuni mavjud emas");
        }
    }
}
