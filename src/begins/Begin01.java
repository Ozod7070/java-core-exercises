package begins;

import java.util.Scanner;

public class Begin01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadratning tomonini kiririing a: ");
        double a = scanner.nextDouble();
        double perimetr =  (4 * a);
        System.out.println("Kvadratning perimetiri: "+ perimetr);
    }
}
