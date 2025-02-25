package strings;

import java.util.Scanner;

public class String19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr kiriting: ");
        String str = scanner.nextLine();
        System.out.println(number(str));


    }
    public  static  int number(String str){
        if(str.matches("-?\\d++")){
            return 1;
        } else if (str.matches("-?\\d*\\.\\d+")) {
            return 2;
        }else{
            return 0;
        }
    }
}
