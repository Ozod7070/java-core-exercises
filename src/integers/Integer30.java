package integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yil kiriting: ");
        int yil = scanner.nextInt();
        int asr = (yil / 100) + 1;
        System.out.println(asr + "-asrga kiradi");
    }
}
