package equpalt.com.vk;

import java.util.Scanner;

public class Enia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(getSulf(in.nextInt(),in.nextInt(),in.nextInt()));
    }

    private static int getSulf(int n, int a, int b) {
        return a*b*n*2;
    }
}
