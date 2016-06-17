package equpalt.com.vk.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DwarfsDivorce {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num = new BigInteger(reader.readLine());

        System.out.println(num.mod(new BigInteger("7")));
    }
}
