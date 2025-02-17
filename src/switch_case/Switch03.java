package switch_case;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting: ");
        int oy = scanner.nextInt();
        switch (oy){
            case 1 -> System.out.println("Qish");
            case 2 -> System.out.println("Qish");
            case 3 -> System.out.println("Bahor");
            case 4 -> System.out.println("Bahor");
            case 5 -> System.out.println("Bahor");
            case 6 -> System.out.println("Yoz");
            case 7 -> System.out.println("Yoz");
            case 8 -> System.out.println("Yoz");
            case 9 -> System.out.println("Kuz");
            case 10 -> System.out.println("Kuz");
            case 11 -> System.out.println("Kuz");
            case 12 -> System.out.println("Qish");
            default -> System.out.println("Bunaqa oy mavjud emas");

        }
    }
}
