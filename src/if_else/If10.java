package if_else;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int A = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int B = scanner.nextInt();
        if(A != B){
            System.out.println(A+B);
        }else if(A == B){
            System.out.println(0);
        }else {
            System.out.println(A);
            System.out.println(B);
        }
    }
}


