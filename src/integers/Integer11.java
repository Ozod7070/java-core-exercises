package integers;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 99 && son < 1000){
            int yuzlar = son / 100;
            int onlar = son / 10 % 10;
            int birlar = son % 10;
            int yigindi = yuzlar + birlar + onlar;
            System.out.println("Uch xonali sonning raqamlar yigindisi: "+yigindi);
        }
        else{
            System.out.println("Uch xonali son kiriting?");
        }
    }
}
