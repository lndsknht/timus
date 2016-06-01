package equpalt.com.vk;

import java.util.Scanner;

public class FullHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n == 2) {
            System.out.println(0);
        } else if (n / 2 < k) {
            k = n - k + 1;
            System.out.println(n - k - 2);
        } else {
            System.out.println(n - k - 2);
        }
    }
}
