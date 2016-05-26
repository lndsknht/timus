package equpalt.com.vk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneComaTenComa {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(reader.readLine());
        long tmp;
        String ZERO = "0 ";
        String ONE = "1 ";

        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(reader.readLine());

            double num = Math.sqrt(8 * tmp - 7);

            long fullNum = (long) num;

            double part = num - fullNum;

            if (part == 0) System.out.print(ONE);
            else System.out.print(ZERO);
        }
    }
}
