package equpalt.com.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class BackRoot {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.0000",s);

        List<Long> list = new ArrayList<>();

        while (input.hasNextLine())
        {
            String[] line = input.nextLine().split(" ");
            for (String str: line) {
                if (!str.isEmpty()) {
                    list.add(Long.parseLong(str));
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            output.println(df.format(Math.sqrt(list.get(i))));
        }
        output.flush();
    }
}
