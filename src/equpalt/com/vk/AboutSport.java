package equpalt.com.vk;

import java.io.IOException;
import java.util.Scanner;

public class AboutSport {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[][] monitor = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                monitor[i][j] = in.nextInt();
            }
        }
        int z = size - 1;
        int diagonals = size * 2 - 1;
        for (int i = 0; i < diagonals; i++) {
            int dSize = i < size ? i + 1 : 2 * size - i - 1;
            if (i >= size) {

                for (int k = 0; k < dSize; k++) {
                    System.out.print(monitor[z-k][z-dSize+1+k] + " ");
                }
                continue;
            }
            for (int j = 0; j < dSize; j++) {
                System.out.print(monitor[dSize-j-1][j] + " ");
            }
        }
    }
}
