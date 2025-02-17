package switch_case;

import java.util.Scanner;

public class Switch07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Og'irlikni kiriting: ");
        double weight = scanner.nextDouble();
        System.out.print("Son kiriting: ");
        int res = scanner.nextInt();
        switch (res) {
            case 1 -> {
                double resultat = weight;
                System.out.println(resultat + "kg");
            }
            case 2 -> {
                double resultat = weight / 1000000;
                System.out.println(resultat + "kg");
            }
            case 3 -> {
                double resultat = weight / 1000;
                System.out.println(resultat + "kg");
            }
            case 4 -> {
                double resultat = weight * 1000;
                System.out.println(resultat + "kg");
            }
            case 5 -> {
                double resultat = weight * 100;
                System.out.println(resultat + "kg");
            }
            default -> {
                System.out.println("5 dan katta son kiritdingiz");
            }
        }
    }
}
