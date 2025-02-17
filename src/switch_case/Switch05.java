package switch_case;

import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting a: ");
        int a = scanner.nextInt();
        System.out.print("Son kiriting b:");
        int b = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int res = scanner.nextInt();
        switch (res){
            case 1 ->{ res = a + b;
                System.out.println(res); }
            case 2 ->{ res = a - b;
                System.out.println(res);}
            case 3 ->{ res = a / b;
                System.out.println(res);}
            case 4 ->{ res = a * b;
                System.out.println(res);}
        }
    }
}
