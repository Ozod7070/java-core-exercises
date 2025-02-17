package switch_case;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("K soniga qiymat kiriting: ");
        int baho = scanner.nextInt();
        switch (baho){
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("Qoniqarsiz");
            case 3 -> System.out.println("Qoniqarli");
            case 4 -> System.out.println("Yaxshi");
            case 5 -> System.out.println("Alo");
            default -> System.out.println("Bunday baho turi mavjud emas");
        }
    }
}
