package equpalt.com.vk;

import java.util.*;

public class TitansRuins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = scanner.nextInt();

        int num2pos = 0;

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int maxSum = 0;

        for (int i = 2; i < list.size(); i++) {
            if (maxSum == 0) {
                maxSum = list.get(i-2) + list.get(i-1) + list.get(i);
                num2pos = i;
                continue;
            }
            int temp = list.get(i-2) + list.get(i-1) + list.get(i);

            if (maxSum < temp) {
                maxSum = temp;
                num2pos = i;
            }
        }
        System.out.println(maxSum + " " + num2pos);
    }
}
