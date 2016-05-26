package equpalt.com.vk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OwnNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int totalOwnNums = 0;

        int n1 = scanner.nextInt();
        for (int i = 0; i < n1; i++){
            map.put(scanner.nextInt(), 1);
        }

        int n2 = scanner.nextInt();
        for (int i = 0; i < n2; i++){
            int tempKey = scanner.nextInt();
            if (map.containsKey(tempKey)) {
                map.put(tempKey, map.get(tempKey)+1);
            } else {
                map.put(tempKey, 1); }
        }

        int n3 = scanner.nextInt();
        for (int i = 0; i < n3; i++){
            int tempKey = scanner.nextInt();
            if (map.containsKey(tempKey)) {
                map.put(tempKey, map.get(tempKey)+1);
            } else {
                map.put(tempKey, 1); }
        }

        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            Integer value = pair.getValue();
            if (value >= 3) totalOwnNums++;
        }
        System.out.println(totalOwnNums);
    }
}
