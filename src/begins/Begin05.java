package begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kubning tomonini kiriting a: ");
        double a = scanner.nextDouble();
        double hajm = (a * a * a);
        double sirt = (a * a) * 6;
        System.out.println("Kubning hami: "+hajm);
        System.out.println("Kubning sirti: "+sirt);

    }
}
