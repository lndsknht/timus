package equpalt.com.vk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HistoryExam {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> teachersSet = new HashSet<>();

        int numOfDates = 0;

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            teachersSet.add(reader.readLine());
        }

        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {
            if (teachersSet.contains(reader.readLine())) {
                numOfDates++;
            }
        }
        System.out.println(numOfDates);
        reader.close();
    }
}
