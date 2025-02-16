package if_else;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int son = scanner.nextInt();
        if(son > 0){
            System.out.println(son+1);
        }
        else{
            System.out.println(son);
        }
    }
}
