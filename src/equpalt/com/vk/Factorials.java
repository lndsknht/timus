package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 20.07.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Factorials {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        char[] lineArray = line.toCharArray();

        StringTokenizer stringTokenizer = new StringTokenizer(line);

        long num = Long.parseLong(stringTokenizer.nextToken());

        int exMarkCount = 0;

        char expMark = 33;

        for (Character c : lineArray) {
            if (c.equals(expMark)) {
                exMarkCount++;
            }
        }

        if (num == 0) {
            System.out.println("1");
        } else if (exMarkCount >= num) {
            System.out.println(num);
        } else if (exMarkCount == 1) {
            System.out.println(getPlainFactorial(num));
        } else if (exMarkCount == 2) {
            System.out.println(getDoubleFactorial(num));
        } else if (exMarkCount >= 3) {
            System.out.println(getMultiFactorial(num, exMarkCount));
        }
    }

    public static long getMultiFactorial(long num, int marks) {
        int result = 1;
        long rest = num % marks;

        if (rest == 0) {
            for (long k = num; k >= marks; k -= marks) {
                result *= k;
            }
        } else {
            for (long k = num; k >= rest; k -= marks) {
                result *= k;
            }
        }

        return result;
    }

    public static long getDoubleFactorial(long i) {
        long result = 1;
        if (isOdd(i)) {
            for (int k = 3; k <= i; k+=2) {
                result *= k;
            }
        } else {
            for (int k = 2; k <= i; k+=2) {
                result *= k;
            }
        }

        return result;
    }

    public static long getPlainFactorial(long i) {
        if (i == 0) return 1;

        return i * getPlainFactorial(i - 1);
    }

    public static boolean isOdd(long i) {
        return (i % 2) != 0;
    }
}
