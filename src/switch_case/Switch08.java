package switch_case;

import java.util.Scanner;

public class Switch08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sanani kiriting: ");
        int day = scanner.nextInt();
        System.out.print("Oyni kiriting: ");
        int month = scanner.nextInt();
        int onlik = day / 10;
        int birlik = day % 10;
        switch (onlik){
            case 1 -> System.out.print("O'n ");
            case 2 -> System.out.print("Yigirma ");
            case 3 -> System.out.print("O'ttiz ");
        }
        switch (birlik){
            case 1 -> System.out.print("birinchi ");
            case 2 -> System.out.print("ikkinchi ");
            case 3 -> System.out.print("uchinchi ");
            case 4 -> System.out.print("to'rtinchi ");
            case 5 -> System.out.print("beshinchi ");
            case 6 -> System.out.print("oltinchi ");
            case 7 -> System.out.print("yettinchi ");
            case 8 -> System.out.print("sakkizinchi ");
            case 9 -> System.out.print("to'qqizinchi ");
        }

        switch (month){
            case 1 -> System.out.println("Yanvar ");
            case 2 -> System.out.println("Fevral ");
            case 3 -> System.out.println("Mart ");
            case 4 -> System.out.println("Aprel ");
            case 5 -> System.out.println("May ");
            case 6 -> System.out.println("Iyun ");
            case 7 -> System.out.println("Iyul ");
            case 8 -> System.out.println("Avgust ");
            case 9 -> System.out.println("Sentabr ");
            case 10 -> System.out.println("Oktyabr ");
            case 11 -> System.out.println("Noyabr ");
            case 12 -> System.out.println("Dekabr ");
        }

    }
}
