package equpalt.com.vk;

import java.util.Scanner;

public class CentipedsMorning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result;

        result = a > b ? a*2+39 : b*2+40;

        System.out.println(result);
    }
}
