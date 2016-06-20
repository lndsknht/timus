package equpalt.com.vk.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DwarfDivorce {
    public static void main(String[] args) throws IOException {
        System.out.println(new BigInteger(new BufferedReader(new InputStreamReader(System.in)).readLine()).mod(new BigInteger("7")));
    }
}
