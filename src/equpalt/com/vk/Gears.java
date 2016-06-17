package equpalt.com.vk.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gears {

    private static boolean[][] adjacencyMatrix;
    private static boolean[] isTurned;
    private static int[] numOfCogs;
    private static int numOfGears;
    private static String[] spinSide;
    private static int numOfGearToSpin;
    private static int numOfTurnovers;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        numOfGears = Integer.parseInt(reader.readLine());

        adjacencyMatrix = new boolean[numOfGears + 1][numOfGears +1];
        isTurned = new boolean[numOfGears + 1];
        numOfCogs = new int[numOfGears + 1];
        spinSide = new String[numOfGears + 1];

        StringTokenizer stringTokenizer;

        for (int i = 1; i <= numOfGears; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            numOfCogs[i] = Integer.parseInt(stringTokenizer.nextToken());

            while (stringTokenizer.hasMoreTokens()) {
                int connection = Integer.parseInt(stringTokenizer.nextToken());
                if (connection != 0) {
                    adjacencyMatrix[i][connection] = true;
                }
            }
        }

        stringTokenizer = new StringTokenizer(reader.readLine());

        numOfGearToSpin = Integer.parseInt(stringTokenizer.nextToken());
        numOfTurnovers = Integer.parseInt(stringTokenizer.nextToken());

        turnGear(numOfGearToSpin, "left");

        int leftNum = numOfCogs[numOfGearToSpin] * numOfTurnovers;

        for (int i = 1; i < numOfCogs.length; i++) {
            int localMinDivisor = useEuclidAlg(leftNum, numOfCogs[i]);
            if (!isNull(spinSide[i]) && spinSide[i].equals("left")) {
                System.out.println(leftNum / localMinDivisor + "/" + numOfCogs[i] / localMinDivisor);
            } else if (!isNull(spinSide[i]) && spinSide[i].equals("right")) {
                System.out.println("-" + leftNum / localMinDivisor + "/" + numOfCogs[i] / localMinDivisor);
            } else if (isNull(spinSide[i])) {
                System.out.println("0/1");
            }
        }
    }

    private static void turnGear(int target, String spinDirection) {
        isTurned[target] = true;
        if (spinSide[target] == null) {
            spinSide[target] = spinDirection;
        }

        for (int k = 1; k <= numOfGears; k++) {
                if (!isTurned[k] && adjacencyMatrix[target][k]) {
                    if (spinDirection.equals("left")) {
                        turnGear(k, "right");
                    } else if (spinDirection.equals("right")) {
                        turnGear(k, "left");
                    }
                }
        }
    }

    public static int useEuclidAlg(int numOne, int numTwo) {
        if (numOne != 0 && numTwo != 0 ) {
            if (numOne == numTwo) return numOne;
        }
        while (numOne != 0 && numTwo != 0) {
            if (numOne > numTwo) {
                numOne = numOne % numTwo;
                useEuclidAlg(numOne, numTwo);
            } else if (numOne < numTwo) {
                numTwo = numTwo % numOne;
                useEuclidAlg(numOne, numTwo);
            }
        }
        int minDivisor = -1;
        if (numOne != 0) {
            minDivisor = numOne;
        } else if (numTwo != 0) {
            minDivisor = numTwo;
        }
        return minDivisor;
    }

    public static boolean isNull(Object obj) {
        return (obj == null);
    }
}
