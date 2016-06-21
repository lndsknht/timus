package equpalt.com.vk.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EkbDrawWell {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countFigures = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int wellType = Integer.parseInt(stringTokenizer.nextToken());
        double wellSize = Double.parseDouble(stringTokenizer.nextToken());

        double maxSize = wellSize;

        if (wellType == 1) {
            maxSize = wellSize * 2;
        } else if (wellType == 2) {
            maxSize = Math.sqrt(2.0) * wellSize;
        } else {
            maxSize = wellSize;
        }

        int numOfSewers = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numOfSewers; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int figureType = Integer.parseInt(stringTokenizer.nextToken());
            double figureSize = Double.parseDouble(stringTokenizer.nextToken());

            double minCurrSize = 0;

            if (figureType == 1) {
                minCurrSize = figureSize * 2;
            } else if (figureType == 2) {
                minCurrSize = figureSize;
            } else if (figureType == 3) {
                minCurrSize = (figureSize / 2) * Math.sqrt(3);
            }

            if (minCurrSize <= maxSize) {
                countFigures++;
            }
        }
        reader.close();
        System.out.println(countFigures);
    }
}