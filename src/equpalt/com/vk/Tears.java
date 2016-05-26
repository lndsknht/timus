package equpalt.com.vk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        int sum = list.get(list.size() - 1) * 2;

        for (int i = 0; i < list.size() - 1; i++) {
            sum += list.get(i);
        }
        System.out.print(sum);
    }
}
