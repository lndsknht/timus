package equpalt.com.vk;

import java.util.Scanner;

public class BikeCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 % 2 != 0 && n2 == 0) {
            System.out.println("no");
        } else if (n1 % 2 != 0 && n2 % 2 == 0) {
            System.out.println("no");
        } else if (n1 % 2 == 0 && n1 % 2 != 0) {
            System.out.println("yes");
        } else if (n1 % 2 == 0 && n1 == 0) {
            System.out.println("yes");
        } else System.out.println("yes");
    }
}