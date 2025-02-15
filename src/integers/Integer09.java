package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting: ");
        int son = scanner.nextInt();
        if (son > 99 && son < 1000){
            int yuzlar = son / 100;
            System.out.println("Uch xonali sonning yuzlar xonasidagi raqam: "+yuzlar);
        }
        else{
            System.out.println("Uch xonali son kiriting?");
        }
    }
}
