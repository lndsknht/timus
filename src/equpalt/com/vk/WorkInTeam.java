package equpalt.com.vk;

import java.util.*;

public class WorkInTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        int n = scanner.nextInt();

        int prevKey = 0;
        for (int i = 0; i < n; i++) {
            int tempKey = scanner.nextInt();

            if (map.containsKey(tempKey)) {
                if (map.get(tempKey)==0) {
                    System.out.print(map.get(prevKey) + " " + prevKey + " ");
                    map.put(prevKey, 0);
                }
                map.put(tempKey, map.get(tempKey)+1);
                prevKey = tempKey;
            } else {
                if (i>0) {
                    System.out.print(map.get(prevKey) + " " + prevKey + " ");
                    map.put(prevKey, 0);
                }
                map.put(tempKey, 1);
                prevKey = tempKey;
            }

            if (i==n-1) {
                System.out.println(map.get(tempKey) + " " + tempKey + " ");
            }
        }
    }
}
