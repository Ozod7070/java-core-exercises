package switch_case;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Uzunlikni kiriting: ");
        double length = scanner.nextDouble();
        System.out.print("Son kiriting: ");
        int res = scanner.nextInt();
        switch (res) {
            case 1 -> {
                double resultat = length / 10;
                System.out.println(resultat);
            }
            case 2 -> {
               double resultat = length * 1000;
                System.out.println(resultat + "metr");
            }
            case 3 -> {
                double resultat = length;
                System.out.println(resultat + "metr");
            }
            case 4 -> {
                double resultat = length / 1000;
                System.out.println(resultat + "metr");
            }
            case 5 -> {
               double resultat = length / 1000;
                System.out.println(resultat + "metr");
            }
            default -> System.out.println("5 dan katta son kiritdingiz");
        }


    }
}
