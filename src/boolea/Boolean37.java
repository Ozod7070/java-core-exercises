package boolea;

import java.util.Scanner;

public class Boolean37 {
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
        if(Math.abs(x1 - x2) <= 1 || Math.abs(y1 - y2) <= 1){
            System.out.println("Shoh bir yurishda o'ta oladi");
        }
        else {
            System.out.println("Shoh bir yurishda o'ta olmaydi");
        }
    }
}
