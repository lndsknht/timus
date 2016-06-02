package equpalt.com.vk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ForStatisticsLovers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();

        int numOfCities = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 1; i <= numOfCities; i++) {
            if (st.hasMoreTokens()) {
                Integer key = Integer.parseInt(st.nextToken());
                if (!map.containsKey(key)) {
                    TreeSet<Integer> set = new TreeSet<>();
                    set.add(i);
                    map.put(key, set);
                } else {
                    map.get(key).add(i);
                }
            }
        }

        int numOfRequests = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numOfRequests; i++) {
            st = new StringTokenizer(reader.readLine());
            if (st.hasMoreTokens()) {
                int searchFrom = Integer.parseInt(st.nextToken());
                int searchTo = Integer.parseInt(st.nextToken());
                int population = Integer.parseInt(st.nextToken());

                if (map.containsKey(population)) {

                    boolean ceilNull = isNull(map.get(population).ceiling(searchFrom));
                    boolean floorNull = isNull(map.get(population).floor(searchTo));


                    if (!ceilNull && !floorNull) {
                        int min = map.get(population).ceiling(searchFrom);
                        int max = map.get(population).floor(searchTo);
                        if (max >= min) {
                            System.out.print("1");
                        } else
                        {
                            System.out.print("0");
                        }
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print("0");
                }
            }
        }
    }

    private static boolean isNull(Object obj) {
        return (obj == null);
    }
}
