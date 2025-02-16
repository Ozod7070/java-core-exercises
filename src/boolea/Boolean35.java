package boolea;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting 1-8 gacha x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Qiymat kiriting 1-8 gacha y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Qiymat kiriting 1-8 gacha x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Qiymat kiriting 1-8 gacha y2: ");
        int y2 = scanner.nextInt();
        if((x1 + y1) % 2 == (x2 + y2) % 2){
            System.out.println("Shaxmat maydoni bir xil rangda");
        }
        else {
            System.out.println("Shaxmat maydoni har xil rangda");
        }
    }
}
