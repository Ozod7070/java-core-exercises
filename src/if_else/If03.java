package if_else;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son = scanner.nextInt();
        if(son > 0){
            System.out.println(son+1);
        }else if(son < 0){
            System.out.println(son-2);
        }else{
            System.out.println(son+10);
        }
    }
}
