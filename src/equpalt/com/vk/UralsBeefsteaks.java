package equpalt.com.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UralsBeefsteaks {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter(System.out);
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        output.println(getMinutes(n, k));
        output.flush();
    }

    private static int getMinutes(int n, int k) {
        if (k == 1) {
            return n * 2;
        } else if (k >= n) {
            return 2;
        }
        return (int)Math.ceil(n*2/(double)k);
    }
}
