package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 04.08.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.TreeSet;

public class Degree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = reader.readLine().split(" ");

        int degreeInt = Integer.parseInt(nums[0]);
        int divisorInt = Integer.parseInt(nums[1]);
        int restInt = Integer.parseInt(nums[2]);

        BigInteger divisor = BigInteger.valueOf(divisorInt);
        BigInteger rest = BigInteger.valueOf(restInt);

        TreeSet<Integer> resultSet = new TreeSet<>();

        for (int i = 1; i <= divisorInt - 1; i++) {
            BigInteger seekingNum = BigInteger.valueOf(i).pow(degreeInt).mod(divisor);

            if (seekingNum.equals(rest)) {
                resultSet.add(i);
            }
        }

        if (resultSet.isEmpty()) {
            System.out.println("-1");
        } else {
            for (Integer num :
                    resultSet) {
                System.out.print(num + " ");
            }
        }
    }
}
