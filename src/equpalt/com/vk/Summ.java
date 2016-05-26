package equpalt.com.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Summ {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);
        int result = sumAllRealNums(input.nextInt());
        output.println(result);
        output.flush();
    }

    public static int sumAllRealNums(int n) {
        int sum = 0;
        if(n <= 0) {
            for (int i = n; i <= 1; i++) sum += i;
        } else {
            for (int i = 1; i <= n; i++) sum += i;
        }
        return sum;
    }
}
