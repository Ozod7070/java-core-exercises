package boolea;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting 1-8 gacha x: ");
        int x = scanner.nextInt();
        System.out.print("Qiymat kiriting 1-8 gacha y: ");
        int y = scanner.nextInt();
        if(x + y % 2 == 0){
            System.out.println("Berilgan maydon oq ");
        }
        else {
            System.out.println("Berilgan maydon qora ");
        }
    }
}
