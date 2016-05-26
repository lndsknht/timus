package equpalt.com.vk;

import java.util.*;

public class Penguins {
    private static final String EMPEROR = "Emperor Penguin";
    private static final String LITTLE = "Little Penguin";
    private static final String MACARONI = "Macaroni Penguin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int emperor = 0, little = 0, macaroni = 0;

        for (int i = 0; i <= n; i++) {
            String penguin = scanner.nextLine();

            switch (penguin) {
                case EMPEROR:
                    emperor++;
                    break;
                case LITTLE:
                    little++;
                    break;
                case MACARONI:
                    macaroni++;
                    break;
            }
        }

        if (emperor > little && emperor > macaroni) {
            System.out.println(EMPEROR);
        } else if (little > emperor && little > macaroni) {
            System.out.println(LITTLE);
        } else if (macaroni > emperor && macaroni > little) {
            System.out.print(MACARONI);
        }
    }
}
