package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 04.08.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Spamer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());

        HashSet<String> names = new HashSet<>();
        HashSet<String> spamers = new HashSet<>();

        String currentName;
        for (int i = 0; i < lines; i++) {
            currentName = reader.readLine();

            if (names.contains(currentName)) {
                spamers.add(currentName);
            } else {
                names.add(currentName);
            }
        }

        spamers.forEach(System.out::println);
    }
}
