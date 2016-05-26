package equpalt.com.vk;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        int candidates = scanner.nextInt();
        int voters = scanner.nextInt();

        for (int i = 1; i <= candidates; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < voters; i++) {
            int j = scanner.nextInt();
            map.put(j, map.get(j) + 1);
        }

        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat format = new DecimalFormat("0.00", s);

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            double result = (pair.getValue()/(double)voters)*100;
            System.out.println(format.format(result)+"%");
        }
    }
}
