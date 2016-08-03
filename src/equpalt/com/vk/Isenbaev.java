package equpalt.com.vk.timus;
/**
 * Created by Landsknecht on 02.08.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Isenbaev {
    private static final String ISENBAEV = "Isenbaev";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(reader.readLine());
        HashSet[] allSets = new HashSet[lines];

        ArrayList<HashSet<String>> allTeamsByLevel = new ArrayList<>(); // list which contains people sorted by their INumber

        TreeMap<String, Integer> resultMap = new TreeMap<>();

        for (int i = 0; i < lines; i++) {
            HashSet<String> currentSet = new HashSet<>();
            Collections.addAll(currentSet, reader.readLine().split(" "));
            allSets[i] = currentSet;
        }

        HashSet<String> setWithTeammates = new HashSet<>();

        for (int i = 0; i < allSets.length; i++) { //проход по всем сетам в поисках одноком Исенбаева, которые добавляются
            HashSet<String> currentSet = allSets[i]; //в новый сет и в ArrayList


            if (currentSet.contains(ISENBAEV)) {
                if (allTeamsByLevel.isEmpty()) {
                    resultMap.put(ISENBAEV, 0);
                    HashSet<String> isenbSet = new HashSet<>();
                    isenbSet.add(ISENBAEV);
                    allTeamsByLevel.add(isenbSet);
                }

                for (String name : currentSet) {
                    if (!name.equals(ISENBAEV)) {
                        setWithTeammates.add(name);
                        resultMap.put(name, 1);
                    }
                }
            }
        }

        allTeamsByLevel.add(setWithTeammates);

        for (int i = 1; i < allTeamsByLevel.size(); i++) { //берём уже найденных тиммэйтов
            HashSet<String> currentSet = allTeamsByLevel.get(i);

            HashSet<String> setWithSortedPeople = new HashSet<>(); //сет для новонайденных людей следующего уровня (i+1)
            for (String name : currentSet) {
                for (HashSet<String> set : allSets) {
                    if (set.contains(name)) {
                        for (String seekingSurname :
                                set) {
                            if (!seekingSurname.equals(name) && !resultMap.containsKey(seekingSurname)) {
                                setWithSortedPeople.add(seekingSurname);
                                resultMap.put(seekingSurname, i+1);
                            }
                        }
                    }
                }
            }
            if (!setWithSortedPeople.isEmpty()) {
                allTeamsByLevel.add(setWithSortedPeople);
            }
        }

        for (int i = 0; i < allSets.length; i++) {
            HashSet<String> currentSet = allSets[i];

            for(String name : currentSet) {
                if (!resultMap.containsKey(name)) {
                    resultMap.put(name, -1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry: resultMap.entrySet()) {
            if (entry.getValue() == -1) {
                System.out.println(entry.getKey() + " undefined");
            } else {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
