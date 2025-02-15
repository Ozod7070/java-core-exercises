package begins;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Katetning birinchi tomoni a: ");
        double a = scanner.nextDouble();
        System.out.print("Katetning ikkinchi tomoni b: ");
        double b = scanner.nextDouble();
        double gipotenuza = Math.sqrt(a * a + b * b);
        double perimetr = a + b + gipotenuza;
        System.out.println("To'g'ri uchburchakning gipotenuzasi: "+gipotenuza);
        System.out.println("To'g'ri uchburchakning perimetri: "+perimetr);

    }
}
