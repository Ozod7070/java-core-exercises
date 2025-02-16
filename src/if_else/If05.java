package if_else;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int son1 = scanner.nextInt();
        System.out.println("Son kiriting: ");
        int son2 = scanner.nextInt();
        System.out.println("Son kiriting: ");
        int son3 = scanner.nextInt();
        if(son1 > 0 && son2 > 0 && son3 > 0){
            System.out.println("3 ta musbat son mavjud");
        }else if(son1 > 0 && son2 > 0 && son3 < 0 || son1 > 0 && son2 < 0 && son3 > 0 ||
                son1 < 0 && son2 > 0 && son3 > 0 ){
            System.out.println("2 ta musbat 1 ta manfiy");
        }else{
            System.out.println("1 ta musbat 2 ta manfiy");
        }

    }
}
