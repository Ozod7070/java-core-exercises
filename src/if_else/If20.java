package if_else;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num1 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int num2 = scanner.nextInt();
        System.out.print("Son kiriting: ");
        int num3 = scanner.nextInt();
        int ayirma1 = num1 - num3;
        int ayirma2 = num1 - num2;
        if(ayirma1 > ayirma2){
            System.out.println("A kesmaga B kema yaqin masofasi "+ ayirma2);
        }else {
            System.out.println("A kesmaga C kesma yaqin masofasi "+ ayirma1);
        }

        }
    }

