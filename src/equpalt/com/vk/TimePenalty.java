package equpalt.com.vk.timus;

/**
 * Created by Landsknecht on 03.08.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimePenalty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] time = reader.readLine().split(" ");

        int qxxTime = Integer.parseInt(time[0]);
        int zzzTime = Integer.parseInt(time[1]);

        time = reader.readLine().split(" ");

        int penalty = 0;

        for (int i = 0; i < time.length; i++) {
            penalty += Integer.parseInt(time[i]);
        }

        int result =  penalty * 20;

        if (zzzTime - result >= qxxTime) {
            System.out.println("No chance.");
        } else if (zzzTime - result < qxxTime) {
            System.out.println("Dirty debug :(");
        }
    }
}
