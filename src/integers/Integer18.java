package integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("999 dan katta son kiriting: ");
        int son = scanner.nextInt();
        if(son > 999){
            int minglik = (son / 1000) % 10;
            System.out.println("Sonning mingliklar xonasidagi raqam: "+minglik);
        }
        else {
            System.out.println("999 dan kichik son kiritdingiz?");
        }
    }
}
