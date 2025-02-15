package begins;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinchi avtomabil tezligini kiriting: ");
        double v1 = scanner.nextDouble();
        System.out.print("Ikkinchi avtomabil tezligini kiriting: ");
        double v2 = scanner.nextDouble();
        System.out.print("Orasidagi masofani kiriting: ");
        double s = scanner.nextDouble();
        System.out.print("Vaqtini kiriting: ");
        double t = scanner.nextDouble();
        double masofa = s + (v1 * t) + (v2 * t);
        System.out.println(" t vaqtdan keyin ular orasidagi masofa: "+masofa);
    }
}
