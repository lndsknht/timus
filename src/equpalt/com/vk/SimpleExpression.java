package equpalt.com.vk;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        if (list.get(1) == 1 || list.get(1) == 0) {
            System.out.println(list.get(0) - list.get(1) - list.get(2));
        } else {
            System.out.println(list.get(0) - (list.get(1) * list.get(2)));
        }
    }
}
