package whiles;

import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting n: ");
        int n = scanner.nextInt();
        double res = 1;
        while (n > 0){
            res *= n;
            n -=2;
        }
        System.out.println("n!!= " + res);
    }
}
