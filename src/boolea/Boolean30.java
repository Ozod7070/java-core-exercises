package boolea;

import java.util.Scanner;

public class Boolean30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uchburchakning birinchi tomoni kiriting: ");
        double a = scanner.nextDouble();
        System.out.print("Uchburchakning ikkinchi tomonini kiriting: ");
        double b = scanner.nextDouble();
        System.out.print("Uchburchakning uchinchi tomonini kiriting: ");
        double c = scanner.nextDouble();
        if(a == b && a == c){
            System.out.println("Teng tomonli uchburchak");
        }
        else{
            System.out.println("Teng tomonli bolmagan uchburchak");
        }

    }
}
