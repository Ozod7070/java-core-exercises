package integers;

import java.util.Scanner;

public class Integer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi kesmani uzunligini kiriting: ");
        int A = scanner.nextInt();
        System.out.print("Ikkinchi kesmani uzunligini kiriting: ");
        int B = scanner.nextInt();
        if (A > B) {
            int marta = A / B;
            int qoldiq =  A % B;
            System.out.println("B kesma A ga joylashadi: "+marta);
            System.out.println("A kesmada B kesmaning joylashmagan qismi: "+qoldiq);
        }
        else{
            System.out.println(" A katta bolish kerak B dan");
        }
    }
}
