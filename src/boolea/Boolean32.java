package boolea;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uchburchakning birinchi tomoni kiriting: ");
        double a = scanner.nextDouble();
        System.out.print("Uchburchakning ikkinchi tomonini kiriting: ");
        double b = scanner.nextDouble();
        System.out.print("Uchburchakning uchinchi tomonini kiriting: ");
        double c = scanner.nextDouble();
        if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
            System.out.println("To'g'ri burcakli uchburchak");
        }
        else{
            System.out.println("To'g'ri burchakli bolmagan uchburchak");
        }
    }
}
