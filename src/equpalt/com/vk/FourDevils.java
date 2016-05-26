package equpalt.com.vk;

import java.util.Scanner;

public class FourDevils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum+=i;
        }

        if (sum%2==0) {
            System.out.println("black");
        }
        if (sum%2!=0) {
            System.out.println("grimy");
        }
    }
}
