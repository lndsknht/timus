package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 04.08.2016.
 */
 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");

        int petyasStart = Integer.parseInt(line[0]), petyasStep = Integer.parseInt(line[1]), taxiStart = Integer.parseInt(line[2]), taxiStep = Integer.parseInt(line[3]);
        int petyaCurrent = petyasStart, taxiCurrent = taxiStart;

        while (true) {

            if (petyasStart >= taxiStart) {
                System.out.println(petyasStart);
                break;
            } else if (petyaCurrent == taxiCurrent) {
                System.out.println(petyaCurrent);
                break;
            } else if (petyaCurrent + petyasStep > taxiCurrent) {
                System.out.println(taxiCurrent);
                break;
            }
            petyaCurrent += petyasStep;
            if (taxiCurrent - taxiStep < petyaCurrent) {
                System.out.println(petyaCurrent);
                break;
            }
            taxiCurrent -= taxiStep;
        }
    }
}
