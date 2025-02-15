package begins;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting: ");
        double x1 = scanner.nextDouble();
        System.out.print("Qiymat kiriting: ");
        double x2 = scanner.nextDouble();
        double masofa = Math.abs(x2 - x1);
        System.out.println("Orasidagi masaofa: "+masofa);
    }
}
