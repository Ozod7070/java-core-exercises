package begins;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Qiymat kiriting A: ");
        double A = scanner.nextDouble();
        System.out.print("Qiymat kiriting B: ");
        double B = scanner.nextDouble();
        double almashA = (A + B) - A;
        double almashB = (A + B) - B;
        System.out.println("Almashgan qiymatlar: "+almashA);
        System.out.println("Almashgan qiymatlar: "+almashB);

    }
}
