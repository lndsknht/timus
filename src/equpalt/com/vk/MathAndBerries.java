package equpalt.com.vk;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MathAndBerries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);
        ArrayList<Integer> nums = new ArrayList<>();

        while (input.hasNextLine()) {
            String[] tempMass = input.nextLine().split(" ");

            nums.add(Integer.parseInt(tempMass[0]));
            nums.add(Integer.parseInt(tempMass[1]));
        }

        output.println((nums.get(0)-nums.get(4)) + " " + (nums.get(1) - nums.get(3)));
        output.flush();
        output.close();
    }
}
