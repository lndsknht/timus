package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 05.07.2016.
 */
 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Symbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Set<Character>> vocabulary = new HashMap<>();

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            String currentWord = reader.readLine();
            char firstLetter = currentWord.charAt(0);

            if (!vocabulary.containsKey(firstLetter)) {
                Set<Character> secondLettersSet = new HashSet<>();
                secondLettersSet.add(currentWord.charAt(1));
                vocabulary.put(firstLetter,secondLettersSet);
            } else if (vocabulary.containsKey(firstLetter)) {
                Set<Character> secLetSet = vocabulary.get(firstLetter);
                secLetSet.add(currentWord.charAt(1));
                vocabulary.put(firstLetter, secLetSet);
            }
        }

        Character seekingChar = reader.readLine().charAt(0);

        if (vocabulary.containsKey(seekingChar)) {
            Set<Character> seekingSet = vocabulary.get(seekingChar);
            for (Character c : seekingSet) {
                System.out.println(seekingChar.toString() + c.toString());
            }
        }
    }
}
