package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 05.08.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneStep {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean winner = false;

        String line = reader.readLine();

        int ticket = Integer.parseInt(line);

        ticket++;
        line = ticket + "";

        int sumFirst = getSum(line, 1);
        int sumLast = getSum(line, 2);

        if (isLucky(sumFirst, sumLast)) {
            winner = true;
        }

        ticket -= 2;
        String updLine = ticket + "";

        sumFirst = getSum(updLine, 1);
        sumLast = getSum(updLine, 2);

        if (isLucky(sumFirst, sumLast)) {
            winner = true;
        }

        if (winner) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static int getSum(String lineTicket, int part) {
        int sumTicket = 0;
        if (lineTicket.length() == 5) {
            lineTicket = "0" + lineTicket;
        } else if (lineTicket.length() == 4) {
            lineTicket = "00" + lineTicket;
        } else if (lineTicket.length() == 3) {
            lineTicket = "000" + lineTicket;
        } else if (lineTicket.length() == 2) {
            lineTicket = "0000" + lineTicket;
        } else if (lineTicket.length() == 1) {
            lineTicket = "00000" + lineTicket;
        }
        if (part == 1) {
            for (int i = 0; i < 3; i++) {
                sumTicket += Character.getNumericValue(lineTicket.charAt(i));
            }
        } else if (part == 2) {
            for (int i = 3; i < lineTicket.length(); i++) {
                sumTicket += Character.getNumericValue(lineTicket.charAt(i));
            }
        }
        return sumTicket;
    }

    private static boolean isLucky(int sumFirst, int sumLast) {        return Math.abs(sumFirst - sumLast) == 0;
    }
}
