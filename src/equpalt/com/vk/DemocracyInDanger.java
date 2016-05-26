package equpalt.com.vk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemocracyInDanger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        int numOfGroupsForVictory = (n/2) + 1;
        int amountOfVotes = 0;

        for (int i = 0; i < numOfGroupsForVictory; i++) {
            amountOfVotes += (list.get(i)/2) + 1;
        }

        System.out.println(amountOfVotes);
    }
}
