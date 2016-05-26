package equpalt.com.vk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airbus {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] mass;

        mass = reader.readLine().split("");

        if (mass.length == 2) {
            int row = Integer.parseInt(mass[0]);
            String letter = mass[1];
            if (row < 3) {
                if (letter.equals("A") || letter.equals("D")) {
                    System.out.println("window");
                } else {
                    System.out.println("aisle");
                }
            } else {
                if (letter.equals("A") || letter.equals("F")) {
                    System.out.println("window");
                } else {
                    System.out.println("aisle");
                }
            }
        } else {
            int row = Integer.parseInt(mass[0]+mass[1]);
            String letter = mass[2];
            if (row < 21) {
                if (letter.equals("A") || letter.equals("F")) {
                    System.out.println("window");
                } else {
                    System.out.println("aisle");
                }
            } else {
                if (letter.equals("A") || letter.equals("K")) {
                    System.out.println("window");
                } else if (letter.equals("C") || letter.equals("D") || letter.equals("G") || letter.equals("H")) {
                    System.out.println("aisle");
                } else {
                    System.out.println("neither");
                }
            }
        }
    }
}
