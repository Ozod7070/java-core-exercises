package if_else;

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son1 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int son2 = scanner.nextInt();
        if(son1 > son2){
            System.out.println(son1);
        }else{
            System.out.println(son2);
        }

    }

}
