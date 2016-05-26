package equpalt.com.vk;

import java.io.PrintWriter;
import java.util.Scanner;

public class AboutGrishaN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int value = input.nextInt();

        output.println(getResult(value));
        output.flush();
        output.close();
    }

    public static String getResult(int n) {
        return n >= 7 ? "YES" : "NO";
    }
}
