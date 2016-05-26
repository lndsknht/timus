package equpalt.com.vk;

import java.util.Scanner;

public class BattleNearSwamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] secondLine = new String[n];
        if (scanner.hasNextLine()) {
            secondLine = scanner.nextLine().split(" ");
        }

        int boom = 0;
        int droid = 0;

        for (String s : secondLine) {
            int result = k - Integer.parseInt(s);
            if (result>0) {
                droid+=result;
            } else if (result<0) {
                boom-=result;
            }
        }
        System.out.println(boom + " " + droid);
    }
}
