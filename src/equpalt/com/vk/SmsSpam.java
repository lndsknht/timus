package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 05.08.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SmsSpam {
    public static HashSet<Character> setOne = new HashSet<>();
    public static HashSet<Character> setTwo = new HashSet<>();
    public static HashSet<Character> setThree = new HashSet<>();

    static {
        setOne.add("a".charAt(0));
        setOne.add("d".charAt(0));
        setOne.add("g".charAt(0));
        setOne.add("j".charAt(0));
        setOne.add("m".charAt(0));
        setOne.add("p".charAt(0));
        setOne.add("s".charAt(0));
        setOne.add("v".charAt(0));
        setOne.add("y".charAt(0));
        setOne.add(".".charAt(0));
        setOne.add(" ".charAt(0));

        setTwo.add("b".charAt(0));
        setTwo.add("e".charAt(0));
        setTwo.add("h".charAt(0));
        setTwo.add("k".charAt(0));
        setTwo.add("n".charAt(0));
        setTwo.add("q".charAt(0));
        setTwo.add("t".charAt(0));
        setTwo.add("w".charAt(0));
        setTwo.add("z".charAt(0));
        setTwo.add(",".charAt(0));

        setThree.add("c".charAt(0));
        setThree.add("f".charAt(0));
        setThree.add("i".charAt(0));
        setThree.add("l".charAt(0));
        setThree.add("o".charAt(0));
        setThree.add("r".charAt(0));
        setThree.add("u".charAt(0));
        setThree.add("x".charAt(0));
        setThree.add("!".charAt(0));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;

        char[] line = reader.readLine().toCharArray();

        for (Character c : line) {
            if (setOne.contains(c)) {
                counter += 1;
            } else if (setTwo.contains(c)) {
                counter += 2;
            } else if (setThree.contains(c)) {
                counter += 3;
            }
        }

        System.out.println(counter);
    }
}
