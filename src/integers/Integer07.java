package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ikki xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 9 && son < 100){
            int birlar = son % 10;
            int onlar = son / 10;
            int yigindi = onlar + birlar;
            System.out.println("Ikkta xonasining yigindisi: "+yigindi);
        }
        else{
            System.out.println("Ikki xonali son kiriting?");
        }
    }

}
