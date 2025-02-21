package whiles;

import java.util.Scanner;

public class While09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sonini kiriting: ");
        int N = scanner.nextInt();
        int k = 1;
        while(3 * k <= N ){
            k++;
        }
        System.out.println("k = " + k);
    }
}
