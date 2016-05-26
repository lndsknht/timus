package equpalt.com.vk;

import java.util.Scanner;

public class TwoBandits {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        if (num1 >= 10 || num2 >= 10) {
            throw new IllegalArgumentException();
        }
        int sum = num1+num2-1;

        System.out.println((sum - num1) + " " + (sum - num2));
    }
}
