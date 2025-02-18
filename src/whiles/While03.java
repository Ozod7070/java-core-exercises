package whiles;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting n: ");
        int n = scanner.nextInt();
        System.out.print("Qiymat kiriting k: ");
        int k = scanner.nextInt();
        int Butun = 0;
        int qoldiq;
        while (k <= n){
            n -=k;
            Butun++;

        }
      qoldiq = n;
        System.out.println("Butun joylashgan qismi " + Butun);
        System.out.println("Qoldiq qismi " + qoldiq);
    }
}
