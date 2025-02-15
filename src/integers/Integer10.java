package integers;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 99 && son < 1000){
            int birliklar = son % 10;
            int onlik = son / 10 % 10;
            System.out.println("Uch xonali sonning birlilklar xonasidagi raqam: "+birliklar);
            System.out.println("Uch xonali sonning o'nliklar xonasidagi raqam: "+onlik);
        }
        else{
            System.out.println("Uch xonali son kiriting?");
        }
    }
}
