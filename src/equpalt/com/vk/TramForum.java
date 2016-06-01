package equpalt.com.vk;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TramForum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tram = 0;
        int trolley = 0;

        while (scanner.hasNextLine()) {
            String lines = scanner.nextLine();

            StringTokenizer st = new StringTokenizer(lines);

            while (st.hasMoreTokens()) {

                String s = st.nextToken("`~!@#$%^&*()-_=+\\|[{]};:'\",<.>/?ГўвЂћвЂ“ ");

                if (s.equals("tram")) {
                    tram++;
                } else if (s.equals("trolleybus")) {
                    trolley++;
                }
            }
        }
        if (tram > trolley) {
            System.out.println("Tram driver");
        } else if (tram < trolley) {
            System.out.println("Trolleybus driver");
        } else if (tram == trolley) {
            System.out.println("Bus driver");
        }
    }
}