package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 03.08.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Accordions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int counter = 0;

        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {
            String currentString = reader.readLine();

            if (set.contains(currentString)) {
                counter++;
            } else {
                set.add(currentString);
            }
        }
        System.out.println(counter);
    }
}
