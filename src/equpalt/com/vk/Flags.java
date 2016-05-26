package equpalt.com.vk;

import java.io.PrintWriter;
import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        output.print(getFib(scanner.nextInt()));
        output.flush();
    }

    private static long getFib(int n) {

        long[] mass = new long[46];

        mass[0] = 0;
        mass[1] = 2;
        mass[2] = 2;
        mass[3] = 4;

        for (int i = 4; i <= n; i++) {
            mass[i] = mass[i - 1] + mass[i - 2];
        }
        return mass[n];
    }
}
