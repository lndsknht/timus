package equpalt.com.vk;

import java.io.PrintWriter;
import java.util.Scanner;

public class WorkDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int n = input.nextInt();
        int m = input.nextInt();

        output.println(getSec(n, m));
        output.flush();
        output.close();
    }

    private static int getSec(int n, int m) {
        return n*(m+1);
    }
}
