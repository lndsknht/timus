package equpalt.com.vk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class DonaldPostman {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"));

        int curPos = 1;

        int time = 0;

        int n = Integer.parseInt(reader.readLine());
        String tmp;

        for (int i = 0; i < n; i++) {
            tmp = reader.readLine();

            if (list1.contains(tmp)) {
                switch(curPos) {
                    case 2: time++;
                        curPos = 1;
                        break;
                    case 3: time+=2;
                        curPos = 1;
                        break;
                }
            } else if (list2.contains(tmp)) {
                switch (curPos) {
                    case 1:
                        time++;
                        curPos = 2;
                        break;
                    case 3:
                        time++;
                        curPos = 2;
                        break;
                }
            } else if (list3.contains(tmp)) {
                switch (curPos) {
                    case 1:
                        time += 2;
                        curPos = 3;
                        break;
                    case 2:
                        time++;
                        curPos = 3;
                        break;
                }
            }
        }
        System.out.println(time);
    }
}
