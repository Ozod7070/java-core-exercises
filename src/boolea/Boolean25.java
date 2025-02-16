package boolea;

import java.util.Scanner;

public class Boolean25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymat kiriting x: ");
        int x = scanner.nextInt();
        System.out.print("Qiymat kiriting y: ");
        int y = scanner.nextInt();
        if (x < 0 && y > 0){
            System.out.println("Ikkinchi choragida yotadi");
        }
        else{
            System.out.println("Ikkinchi choragida yotmaydi");
        }
    }
}
