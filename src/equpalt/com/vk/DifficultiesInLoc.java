package equpalt.com.vk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DifficultiesInLoc {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        int i = Integer.parseInt(reader.readLine());
        if (i < 1 || i > 2000) return;
        output.println(compareCount(i));
        output.flush();
        reader.close();
        output.close();
    }

    private static String compareCount(int a) {

        if (a >= 1 && a <= 4) {
            return "few";
        } else if (a >= 5 && a <= 9) {
            return "several";
        } else if (a >= 10 && a <= 19) {
            return "pack";
        } else if (a >= 20 && a <= 49) {
            return "lots";
        } else if (a >= 50 && a <= 99) {
            return "horde";
        } else if (a >= 100 && a <= 249) {
            return "throng";
        } else if (a >= 250 && a <= 499) {
            return "swarm";
        } else if (a >= 500 && a <= 999) {
            return "zounds";
        }
        return "legion";

    }
}
