package equpalt.com.vk;

import java.util.Scanner;

public class Fuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int fuseAmount = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) fuseAmount++;
        }
        System.out.println(fuseAmount);
    }
}
