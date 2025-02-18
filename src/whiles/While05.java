package whiles;

import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiynat kirting n: ");
        int n = scanner.nextInt();
        int k = 0;
        int temp = n;
        while (temp > 1){
            temp /= 2;
            k++;
        }
        System.out.println(" k soni teng: "+ k);
    }
}
