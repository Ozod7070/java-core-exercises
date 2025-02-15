package begins;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Son kiriting b: ");
        int b = scanner.nextInt();
        if ( a != 0 && b != 0){
            int yigindi = a + b;
            int kopaytma = a * b;
            int modulA = Math.abs(a);
            int modulB = Math.abs(b);
            System.out.println("Yigindisi: "+yigindi);
            System.out.println("Kopaymasi: "+kopaytma);
            System.out.println(" a ning moduli: "+modulA);
            System.out.println(" b ning moduli: "+modulB);
        }
        else{
            System.out.println("Ikkala son ham 0 ga teng bolmasin");
        }
    }
}
