package maxmin;

import java.util.Scanner;

public class Maxmin01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Toplamdagi butun sonlar " + n + " sonini kiriting:");
        for (int i = 0; i < n; i++) {
           int num = scanner.nextInt();
            if(num > max) {
                max = num;
            }
                if(num < min){
                    min = num;
                }
        }
        System.out.println("Eng katta son "+ max);
        System.out.println("Eng kichik son "+ min);
    }
}
