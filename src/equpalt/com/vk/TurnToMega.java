package equpalt.com.vk;

import java.util.Scanner;

public class TurnToMega {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {
            int currentNumOfCars;
            currentNumOfCars = scanner.nextInt();
            if (result > 0) {
                currentNumOfCars += result;
                result = 0;
            }
            if (currentNumOfCars >= k) result = currentNumOfCars - k;
        }
        System.out.println(result);
    }
}
